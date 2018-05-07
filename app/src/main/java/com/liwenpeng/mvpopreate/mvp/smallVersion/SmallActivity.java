package com.liwenpeng.mvpopreate.mvp.smallVersion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.liwenpeng.mvpopreate.R;
import com.liwenpeng.mvpopreate.mvp.smallVersion.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SmallActivity extends BaseActivity implements SmallView {

    @BindView(R.id.tv_show)
    TextView tvShow;
    @BindView(R.id.pb_loading)
    ProgressBar pbLoading;
    @BindView(R.id.btn_success)
    Button btnSuccess;
    @BindView(R.id.btn_fail)
    Button btnFail;
    @BindView(R.id.btn_exception)
    Button btnException;

    private SmallPresenter smallPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small);
        ButterKnife.bind(this);
        smallPresenter = new SmallPresenter();
        //绑定view引用
        smallPresenter.attachView(this);

    }

    @Override
    protected void onDestroy() {
        //断开view引用
        smallPresenter.detachView();
        super.onDestroy();
    }

    @OnClick({R.id.btn_success, R.id.btn_fail, R.id.btn_exception})
    public void onViewClicked(View view) {
        switch (view.getId()) {

            case R.id.btn_success:

                smallPresenter.getData(0);
                break;
            case R.id.btn_fail:
                smallPresenter.getData(1);
                break;
            case R.id.btn_exception:
                smallPresenter.getData(2);
                break;
        }
    }

    @Override
    public void showProgress() {

        pbLoading.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideProgress() {
        pbLoading.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showSuccessData(String msg) {

        tvShow.setText("展示成功数据"+msg);
    }

    @Override
    public void showErrorData(String msg) {

        tvShow.setText("展示错误数据"+msg);
    }

    @Override
    public void showFailureData(String msg) {
        tvShow.setText("展示失败数据"+msg);
    }
}
