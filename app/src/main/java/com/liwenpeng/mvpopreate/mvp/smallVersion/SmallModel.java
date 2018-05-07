package com.liwenpeng.mvpopreate.mvp.smallVersion;

import android.os.Handler;

/**
 * liwenpeng
 * 2018/5/6 14:20
 */
public class SmallModel {
    static void getData(final int param, final SmallCallBack<String> smallCallBack){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (param){
                    case 0:
                        smallCallBack.onSuccess("请求成功");
                        break;
                    case 1:
                        smallCallBack.onFail("请求失败");
                        break;
                    case 2:
                        smallCallBack.onError("请求错误");
                        break;
                }
                smallCallBack.onComplete("完成");
            }
        },500);
    }
}
