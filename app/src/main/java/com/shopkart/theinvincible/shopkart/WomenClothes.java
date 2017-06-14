package com.shopkart.theinvincible.shopkart;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


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

}
