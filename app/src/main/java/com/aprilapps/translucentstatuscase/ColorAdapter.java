package com.aprilapps.translucentstatuscase;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jacek Kwiecień on 08.10.2015.
 */
public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ViewHolder> {

    private Context context;

    public ColorAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.view_cell, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        int color = android.R.color.holo_red_light;

        switch (position) {
            case 0:
                color = android.R.color.holo_green_light;
                break;
            case 1:
                color = android.R.color.holo_orange_light;
                break;
            case 2:
                color = android.R.color.holo_purple;
                break;
            case 3:
                color = android.R.color.holo_blue_light;
                break;
            case 4:
                color = android.R.color.holo_red_dark;
                break;
        }

        holder.itemView.setBackgroundColor(context.getResources().getColor(color));
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
