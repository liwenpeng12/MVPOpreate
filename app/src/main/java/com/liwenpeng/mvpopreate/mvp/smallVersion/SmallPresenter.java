package com.liwenpeng.mvpopreate.mvp.smallVersion;

import android.content.Context;

import com.liwenpeng.mvpopreate.mvp.smallVersion.base.BasePresenter;
import com.liwenpeng.mvpopreate.mvp.smallVersion.base.BaseView;

/**
 * liwenpeng
 * 2018/5/6 14:18
 */
public class SmallPresenter extends BasePresenter<SmallView>{
    /**
     * 优化：去除构造函数里的接口view
     * */
    public void getData(int flag){
    SmallModel.getData(flag, new SmallCallBack<String>() {
        @Override
        public void onSuccess(String msg) {
            smallView.hideProgress();
            smallView.showSuccessData("onSuccess"+msg);
        }

        @Override
        public void onFail(String msg) {
            smallView.hideProgress();
            smallView.showFailureData("onFail"+msg);
        }

        @Override
        public void onError(String msg) {
            smallView.hideProgress();
            smallView.showErrorData("onError"+msg);
        }

        @Override
        public void onComplete(String msg) {

        }
    });
    }


}
