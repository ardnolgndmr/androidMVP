package com.mvp.main;

import java.util.List;

/**
 * Created by ardenolgundemir on 09/05/2017.
 */

public class MainPresenterImpl implements MainPresenter, FindItemsInteracor.OnFinishedListener {

    MainView mainView;
    private FindItemsInteracor findItemsInteractor;

    public MainPresenterImpl(MainView mainView, FindItemsInteracor findItemsInteractor) {
        this.mainView = mainView;
        mainView.setTextMain("HOPPP");
        this.findItemsInteractor = findItemsInteractor;
    }


    public MainView getMainView() {
        return mainView;
    }


    @Override
    public void onFinished(List<String> items) {
        if (mainView != null) {
            mainView.setItemList(items);
        }
    }

    @Override
    public void onResume() {
        findItemsInteractor.findItems(this);
    }

    @Override
    public void onItemClick(int position) {
        if (mainView != null) {
            mainView.setTextMain(String.format("Position %d clicked", position + 1));
        }
    }
}
