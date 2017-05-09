package com.mvp.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.mvp.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ardenolgundemir on 09/05/2017.
 */

public class MainActivity extends AppCompatActivity implements MainView, AdapterView.OnItemClickListener {

    MainPresenter mainPresenter;
    @BindView(R.id.tvMain)
    TextView tvMain;
    @BindView(R.id.listView)
    ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mainPresenter = new MainPresenterImpl(this,new FindItemsInteractorImpl());
        listView.setOnItemClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mainPresenter.onResume();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setTextMain(String title) {
        tvMain.setText(title);
    }

    @Override
    public void setItemList(List<String> list) {
        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, list));
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mainPresenter.onItemClick(position);
    }
}
