package cn.ctauto.operate.util;

/**
 * Created by Gary on 2016/9/6.
 */
public class UtilButton {

    private static long lastClickTime;

    /**
     * 是否快速点击（和上次点击时间差小于0.5秒）
     *
     * @return
     */
    public synchronized static boolean isFastClick() {
        long time = System.currentTimeMillis();
        if (time - lastClickTime < 500) {
            return true;
        }
        lastClickTime = time;
        return false;
    }
}
