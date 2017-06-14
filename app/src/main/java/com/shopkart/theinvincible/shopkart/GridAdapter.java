package com.shopkart.theinvincible.shopkart;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H.P on 14-Jun-17.
 */

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridViewHolder> {

    private List<WomenItem> womenItems;

    public GridAdapter() {
        womenItems = new ArrayList<>();
        womenItems.add(new WomenItem("Red Top", "$10", R.drawable.womenone));
        womenItems.add(new WomenItem("Red Top", "$10", R.drawable.womenone));
        womenItems.add(new WomenItem("Red Top", "$10", R.drawable.womenone));
        womenItems.add(new WomenItem("Red Top", "$10", R.drawable.womenone));
        womenItems.add(new WomenItem("Red Top", "$10", R.drawable.womenone));
        womenItems.add(new WomenItem("Red Top", "$10", R.drawable.womenone));
        womenItems.add(new WomenItem("Red Top", "$10", R.drawable.womenone));
        womenItems.add(new WomenItem("Red Top", "$10", R.drawable.womenone));
        womenItems.add(new WomenItem("Red Top", "$10", R.drawable.womenone));
        womenItems.add(new WomenItem("Red Top", "$10", R.drawable.womenone));
        womenItems.add(new WomenItem("Red Top", "$10", R.drawable.womenone));
        womenItems.add(new WomenItem("Red Top", "$10", R.drawable.womenone));
    }

    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.layout_item_women, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GridViewHolder gridViewHolder, int i) {
        WomenItem womenItem = womenItems.get(i);
        gridViewHolder.bindData(womenItem);
    }

    @Override
    public int getItemCount() {
        return womenItems.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {

        private TextView itemName;
        private TextView itemPrice;
        private ImageView itemImage;

        public GridViewHolder(View itemView) {
            super(itemView);
            itemName = (TextView) itemView.findViewById(R.id.itemName);
            itemPrice = (TextView) itemView.findViewById(R.id.itemPrice);
            itemImage = (ImageView) itemView.findViewById(R.id.ImageWomenItem);

        }

        public void bindData(WomenItem womenItem) {
            itemName.setText(womenItem.mitemName);
            itemPrice.setText(womenItem.mitemPrice);
            itemImage.setImageResource(womenItem.mitemImage);
        }
    }

    public class WomenItem {
        public String mitemName;
        public String mitemPrice;
        public int mitemImage;

        public WomenItem(String mitemName, String mitemPrice, int mitemImage) {
            this.mitemPrice = mitemPrice;
            this.mitemName = mitemName;
            this.mitemImage = mitemImage;
        }
    }

}
