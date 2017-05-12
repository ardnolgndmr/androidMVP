package com.mvp.recyclerAdapter;

import android.os.Handler;

import com.mvp.R;
import com.mvp.model.PictureModel;

import java.util.ArrayList;

/**
 * Created by ardenolgundemir on 12/05/2017.
 */

public class PictureItemInteractorImpl implements PictureItemInteractor {

    private final static String[] pictureNames = {
            "Rocket in the universe",
            "A scene in London",
            "Moon over mountains",
            "A simple moon",
            "Sun and volcano",
            "A collection of mountains",
            "River between mountains",
            "Some pine trees",
            "On Small Town",
            "Volcanos reflection"
    };

    private final static int  pictureImages[] = {
            R.drawable.cohete_flat,
            R.drawable.london_flat,
            R.drawable.material_flat,
            R.drawable.moon_flat,
            R.drawable.mountain_flat,
            R.drawable.mountain_mo_flat,
            R.drawable.moutain_go_flat,
            R.drawable.pine_flat,
            R.drawable.towers_flat,
            R.drawable.vulcan_flat
    };


    @Override
    public void onFinished(final OnLoadListiner loaderListener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loaderListener.onLoad(createCollectionPictures());
            }
        }, 2000);
    }

    private ArrayList<PictureModel> createCollectionPictures() {

        ArrayList<PictureModel> pictures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            PictureModel picture = new PictureModel(pictureNames[i], pictureImages[i]);
            pictures.add(picture);
        }

        return pictures;

    }
}
