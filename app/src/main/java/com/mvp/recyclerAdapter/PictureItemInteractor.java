package com.mvp.recyclerAdapter;

import com.mvp.model.PictureModel;

import java.util.ArrayList;

/**
 * Created by ardenolgundemir on 12/05/2017.
 */

public interface PictureItemInteractor {

    interface OnLoadListiner{
        void onLoad(ArrayList<PictureModel> pictureModels);
    }

    void onFinished(OnLoadListiner loadListiner);
}
