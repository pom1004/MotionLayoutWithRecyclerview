package io.armcha.motionlayout;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;


public class MyWishListAdapter extends RecyclerView.Adapter<MyWishListAdapter.CustomViewHolder> {

    private static final String TAG = "CategoryBoxAdapter";

    private Activity activity;
    private LayoutInflater inflater;


    public MyWishListAdapter(Activity activity) {
        this.activity = activity;
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.activity_sec, parent, false);
        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {


    }


    @Override
    public int getItemCount() {
        return 30;
    }


    public static class CustomViewHolder extends RecyclerView.ViewHolder {

//        ItemMy

        public CustomViewHolder(View v) {
            super(v);
        }

    }
    /////////////////////////////


}
