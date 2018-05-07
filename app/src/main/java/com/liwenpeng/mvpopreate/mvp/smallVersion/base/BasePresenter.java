package com.liwenpeng.mvpopreate.mvp.smallVersion.base;

import com.liwenpeng.mvpopreate.mvp.smallVersion.SmallView;

/**
 * liwenpeng
 * 2018/5/7 10:28
 */
public class BasePresenter <T extends BaseView>{
    protected T smallView;
    public void  attachView(T view){
        smallView = view;
    }
    public void detachView(){
        smallView = null;
    }
    public boolean isViewEmpty(){
        return smallView==null;
    }
}
