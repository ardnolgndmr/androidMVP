package com.mvp.main;

import com.mvp.BaseView;

import java.util.List;

/**
 * Created by ardenolgundemir on 09/05/2017.
 */

public interface MainView extends BaseView {

    void setTextMain(String title);

    void setItemList(List<String> list);

}
