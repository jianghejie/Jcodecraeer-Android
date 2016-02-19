package com.jcodecraeer.app4android.view.Iview;

/**
 * Created by weifucheng on 2016/2/18.
 */
public interface ILoginView {
            void showFailedError();  //显示登陆失败
            void showLoading();      //显示登陆加载
            void hideLoading();     //隐藏登陆加载
            void toMain();          //登陆成功跳转到主界面

}
