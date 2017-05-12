package com.mvp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mvp.R;
import com.mvp.model.PictureModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ardenolgundemir on 12/05/2017.
 */

public class PictureAdapter extends RecyclerView.Adapter<PictureAdapter.ViewHolder> {


    private ArrayList<PictureModel> pictureArrayList;
    private int itemLayout;
 //   private RecyclerItemClickListener recyclerItemClickListener;

//    public void setRecyclerItemClickListener(RecyclerItemClickListener recyclerItemClickListener) {
//        this.recyclerItemClickListener = recyclerItemClickListener;
//    }


    public PictureAdapter() {
    }

    public PictureAdapter(ArrayList<PictureModel> pictureArrayList, int itemLayout) {
        this.pictureArrayList = pictureArrayList;
        this.itemLayout = itemLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final PictureModel picture = pictureArrayList.get(position);
        holder.title.setText(picture.getName());
        holder.imageView.setImageResource(picture.getImage());
    }


    @Override
    public int getItemCount() {
        return pictureArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.txt_title)
        TextView title;
        @BindView(R.id.imageView)
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

//        @Override
//        public void onClick(View view) {
//            if (recyclerItemClickListener != null)
//                recyclerItemClickListener.onItemClickListener(getAdapterPosition());
//        }
    }


}
