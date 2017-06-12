package com.shopkart.theinvincible.shopkart;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by H.P on 11-Jun-17.
 */

public class ImageSliderAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] imagesSlide = {R.drawable.im, R.drawable.sports_category, R.drawable.shopkey};

    public ImageSliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return imagesSlide.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.sliderimagelayout, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.id_imageViewSlider);
        imageView.setImageResource(imagesSlide[position]);
        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(viewPager, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager v = (ViewPager) container;
        View view = (View) object;
        v.removeView(view);
    }
}

