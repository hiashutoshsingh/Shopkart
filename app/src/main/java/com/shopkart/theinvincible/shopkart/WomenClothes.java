package com.shopkart.theinvincible.shopkart;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class WomenClothes extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;


    public WomenClothes() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_women_clothes, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewClothes);
        recyclerView.setHasFixedSize(true);


        mLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new GridAdapter();
        recyclerView.setAdapter(mAdapter);
        return view;
    }

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
            View view = inflater.inflate(R.layout.layout_list_item, viewGroup, false);


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


    }



}

