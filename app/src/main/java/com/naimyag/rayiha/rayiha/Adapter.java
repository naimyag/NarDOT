package com.naimyag.rayiha.rayiha;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Naim on 29.03.2016.
 */
public class Adapter extends BaseAdapter {
    Context context;
    int[] images;

    public Adapter(Context c, int[] img) {
        this.images=img;
        this.context=c;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int pos) {
        return images[pos];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        ImageView imageV=new ImageView(context);
        int newpos=pos+1;
        int koory=newpos%4;
        if(koory==0){koory=4;}

        int koorx=((newpos-koory)/4)+1;

        imageV.setTag(koorx+"-"+koory);
        imageV.setImageResource(images[pos]);
        imageV.setScaleType(ImageView.ScaleType.CENTER);
        imageV.setLayoutParams(new GridView.LayoutParams(150, 150));


        return imageV;
    }
}
