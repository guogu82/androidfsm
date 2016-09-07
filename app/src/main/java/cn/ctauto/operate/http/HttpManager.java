package cn.ctauto.operate.http;

import java.util.concurrent.TimeUnit;

import cn.ctauto.operate.base.Common;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Gary on 2016/9/6.
 */
public class HttpManager {

    //类成员命名规范
    //1:是页面控件 采用前缀
    //demo： Button --> btLogin
    //demo： TextView --> tvUserName
    //2:成员变量，采用前缀m
    //demo： DisplayMetrics mDisplayMetrics
    static Retrofit mRetrofit;
    static OkHttpClient mHttpClient;

    private HttpManager() {
    }

    public synchronized static Retrofit getRetrofit() {
        if (mRetrofit == null) {
            mHttpClient = new OkHttpClient.Builder().connectTimeout(60000, TimeUnit.MILLISECONDS).build();
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(Common.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(mHttpClient)
                    .build();
        }
        return mRetrofit;
    }

}
