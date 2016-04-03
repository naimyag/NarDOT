package com.naimyag.rayiha.rayiha;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Naim on 3.04.2016.
 */
public class BolumAdapter extends BaseAdapter {

    private Context context;
    private Bolumler bolumler;

    public BolumAdapter(Context context, Bolumler bolumler) {
        this.context = context;
        this.bolumler = bolumler;
    }

    @Override
    public int getCount() {
        return bolumler.getBolumler().size();
    }

    @Override
    public Object getItem(int position) {
        return bolumler.getBolumler().get(position);
    }

    @Override
    public long getItemId(int position) {
        return bolumler.getBolumler().get(position).getBolumno();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Bolum blm = (Bolum) getItem(position);


        LayoutInflater li = ((Activity) context).getLayoutInflater();

        LinearLayout pnlItem = (LinearLayout)  li.inflate(R.layout.gridbolumitem, null);




        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int screenWidth = (displaymetrics.widthPixels/3)-20;
        // int screenHeight = displaymetrics.heightPixels;




        TextView txtBolumNo =  (TextView) pnlItem.findViewById(R.id.bolum);
        TextView txtBolum =  (TextView) pnlItem.findViewById(R.id.txtBolum);

        txtBolumNo.setText((position + 1) + "");
        txtBolum.setText("Bölüm");

        return pnlItem;
    }
}
