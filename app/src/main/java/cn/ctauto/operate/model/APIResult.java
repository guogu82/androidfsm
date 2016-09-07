package cn.ctauto.operate.model;

import com.google.gson.Gson;

/**
 * Created by Gary on 2016/6/24/024.
 */
public class APIResult<T> {
    private boolean status;
    private String msg;
    private T data;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public APIResult() {
    }

    public APIResult(boolean status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
