package cn.ctauto.operate.http;



import cn.ctauto.operate.model.APIResult;
import cn.ctauto.operate.model.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by gary on 2016/6/2/002.
 */
public interface GetHttp {

    /**
     * 登录
     *
     * @param username 用户名
     * @param userpwd  密码
     * @return
     */
    @GET("storeorder/Account/Login")
    //http://test.erp.ctauto.cn/api/api/storeorder/Account/Login?username=陈鸿添&pwd=123
    Call<APIResult<User>> login(@Query("username") String username, @Query("pwd") String userpwd);
}
