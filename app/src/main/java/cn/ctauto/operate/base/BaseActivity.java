package cn.ctauto.operate.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.widget.Toast;

/**
 * Created by Gary on 2016/9/6.
 */
public class BaseActivity extends Activity {



    private Toast mToast;

    /**
     * 显示一个Toast类型的消息
     */
    public void showToast(String msg) {
        if (mToast == null) {
            mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
        }
        mToast.setText(msg);
        mToast.show();
    }

    /**
     * 根据资源显示一个Toast类型的消息
     *
     * @param strResId 字符串资源id
     */
    public void showToast(int strResId) {
        if (mToast == null) {
            mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
        }
        mToast.setText(strResId);
        mToast.show();
    }



    private ProgressDialog loadingDialog;
    /**
     * 显示loading
     *
     * @param str 显示的字符
     */
    public void showLoadingDialog(String str) {
        if (loadingDialog == null) {
            loadingDialog = new ProgressDialog(this);
            loadingDialog.setMessage(str);
            loadingDialog.setCanceledOnTouchOutside(false);
            loadingDialog.show();
        } else if (!loadingDialog.isShowing()) {
            loadingDialog.show();
        }
    }

    public void showLoadingDialog() {
        showLoadingDialog("加载中...");
    }

    /**
     * 取消显示loading
     */
    public void dismissLoadingDialog() {
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        loadingDialog = null;
    }

    /**
     * 解决退出activity时 dialog未dismiss而报错的bug
     */
    @Override
    protected void onDestroy() {
        try{
            dismissLoadingDialog();
        }catch (Exception e) {
            System.out.println("myDialog取消，失败！");
        }
        super.onDestroy();
    }
}
