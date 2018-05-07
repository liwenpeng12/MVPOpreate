package com.liwenpeng.mvpopreate.mvp.smallVersion;

/**
 * liwenpeng
 * 2018/5/6 14:19
 */
public interface SmallCallBack<T> {
    void onSuccess(T msg);
    void onFail(String msg);
    void onError(String msg);
    void onComplete(String msg);
}
