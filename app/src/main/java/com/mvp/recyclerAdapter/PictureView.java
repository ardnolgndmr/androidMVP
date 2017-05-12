package com.mvp.recyclerAdapter;

import com.mvp.BaseView;
import com.mvp.model.PictureModel;

import java.util.ArrayList;

/**
 * Created by ardenolgundemir on 12/05/2017.
 */

public interface PictureView extends BaseView {
    void setItemList(ArrayList<PictureModel> list);

}
