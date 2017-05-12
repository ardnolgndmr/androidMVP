package com.mvp.recyclerAdapter;

import com.mvp.model.PictureModel;

import java.util.ArrayList;

/**
 * Created by ardenolgundemir on 12/05/2017.
 */

public class PicturePresenterImpl implements PicturePresenter, PictureItemInteractor.OnLoadListiner {

    PictureView pictureView;
    PictureItemInteractorImpl pictureItemInteractorImpl;

    public PicturePresenterImpl(PictureView pictureView, PictureItemInteractorImpl pictureItemInteractorImpl) {
        this.pictureView = pictureView;
        this.pictureItemInteractorImpl = pictureItemInteractorImpl;
    }

    @Override
    public void onResume() {
        pictureItemInteractorImpl.onFinished(this);
    }

    @Override
    public void onItemClick(int position) {

    }

    @Override
    public void onLoad(ArrayList<PictureModel> pictureModels) {
        if (pictureView!=null){
            pictureView.setItemList(pictureModels);
        }
    }
}
