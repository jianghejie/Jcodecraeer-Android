package com.jcodecraeer.app4android.view.Iview;

/**
 * Created by weifucheng on 2016/2/19.
 */
public interface IArticleListView {
        void showLoaderror();            //显示加载失败界面
        void toArticleDetatilsView();    //跳转到文章详情页面
        void showLoad();                //显示文章列表加载
        void showFresh();               //显示下拉刷新
        void showLoadMore();            //显示上拉加载更多
        void hideLoad();                //隐藏文章列表加载
        void hideFresh();               //隐藏下拉刷新
        void hideLoadMore();            //隐藏上拉加载更多
}
