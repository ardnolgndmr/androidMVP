package com.mvp.recyclerAdapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mvp.R;
import com.mvp.adapter.PictureAdapter;
import com.mvp.model.PictureModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ardenolgundemir on 12/05/2017.
 */

public class PictureActivity extends AppCompatActivity implements PictureView{
    @BindView(R.id.rv)
    RecyclerView rv;

    PicturePresenter picturePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        ButterKnife.bind(this);
        rv.setLayoutManager(new LinearLayoutManager(this));
        picturePresenter = new PicturePresenterImpl(this,new PictureItemInteractorImpl());
    }

    @Override
    protected void onResume() {
        super.onResume();
        picturePresenter.onResume();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setItemList(ArrayList<PictureModel> list) {
        PictureAdapter pictureAdapter = new PictureAdapter(list,R.layout.item_type_one);
        rv.setAdapter(pictureAdapter);
    }
}
