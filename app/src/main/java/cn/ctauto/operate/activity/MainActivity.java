package cn.ctauto.operate.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cn.ctauto.operate.R;
import cn.ctauto.operate.base.BaseActivity;
import cn.ctauto.operate.http.GetHttp;
import cn.ctauto.operate.http.HttpManager;
import cn.ctauto.operate.model.APIResult;
import cn.ctauto.operate.model.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by Gary on 2016/9/7.
 * 本类讲解 Butterknife+Retrofit2+OkHttp3 的使用
 * ButterKnife 的开发教程 http://www.cnblogs.com/mengdd/p/4595973.html
 * Retrofit2 的开发教程 http://wuxiaolong.me/2016/01/15/retrofit/
 * Retrofit2 的开发教程 http://wuxiaolong.me/2016/06/18/retrofits/
 */
public class MainActivity extends BaseActivity {

    //命名规范 常量用全大写。
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //每个activity要注入界面。
        ButterKnife.inject(this);
    }

    //类成员命名规范
    //1:是页面控件 采用前缀
    //demo： Button --> btLogin
    //demo： TextView --> tvUserName
    //2:成员变量，采用前缀m
    //demo： DisplayMetrics mDisplayMetrics
    @InjectView(R.id.tvUserName)
    TextView tvUserName;


    //命名规范 类方法必须是动词+名词，首字母小写。
    @OnClick(R.id.btLogin)
    void loginStore() {
        showLoadingDialog("登陆中……");
        GetHttp loginHttp = HttpManager.getRetrofit().create(GetHttp.class);
        loginHttp.login("陈鸿添", "123").enqueue(new Callback<APIResult<User>>() {

            @Override
            public void onResponse(Call<APIResult<User>> call, Response<APIResult<User>> response) {
                // {"status":false,"msg":null,"data":null}
                // {"status":true,"msg":null,"data":{"userid":257,"username":"陈鸿添","pwd":"MTIz","ctime":"2015/8/1 10:47:16","lltime":"2016/9/1 16:36:42","usertype":"TmxwdFNUWmlhUzgxY21VM1RVUkJkMDFUT0hoTWVrVm5UVVJ2ZDAxRWIzZE5SRWwzVFZSWmRrOVRPSGhKUkVVeVQycE5NazlxVVhrPQ==","iusing":1,"type":0,"otherid":-1,"openid":null,"phone":null,"notes":"","enums":3,"empid":230,"empname":"陈鸿添","ememail":"","emptel":"","empphone":"18122703037","empgender":1,"cardnum":"","empaddress":"","empbirthday":"","facid":9,"emptype":"","postid":8,"rankid":-1,"entrytime":"2015/7/18","createtime":null,"empnation":null,"isusing":1,"university":null,"education":0,"profession":null,"hometown":null,"homeaddress":null,"emergencycontact":null,"ecphone":null,"ifcalc":1,"facadeid":9,"facname":"中海誉城店","facaddress":"广州市黄埔区刘村洋城岗和平大街23号","factrapaze":"","facphone":"020-32022929","postcode":"","ssempname":"屈均杨","ssempid":66,"depid":52,"factypeid":1,"areaid":1,"fsid":-1}}
                if (response.body() == null) {
                    showToast("从服务器获取信息异常");
                    return;
                }
                APIResult<User> result = response.body();
                Log.i("Http", "登录用户信息：" + result.toString());
                if (result.getStatus()) {
                    User user = result.getData();
                    tvUserName.setText(user.getUsername()+",您好!");
                    showToast("你好：" + user.getUsername());
                } else {
                    showToast("登录失败，失败信息：" + result.getMsg());
                }
                dismissLoadingDialog();
            }

            @Override
            public void onFailure(Call<APIResult<User>> call, Throwable t) {
                Log.i("Http", "登录失败信息:" + t.getMessage());
                showToast(t.getMessage());
                dismissLoadingDialog();
            }
        });
    }
}
