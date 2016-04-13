package com.naimyag.rayiha.rayiha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Naim on 13.04.2016.
 */
public class Oyun extends Activity {
    int a=1;

    LinearLayout pnl=new LinearLayout(Oyun.this);
    LinearLayout.LayoutParams LParams=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
    GridView gv=new GridView(Oyun.this);
    Button btn=new Button(Oyun.this);
    TextView txt=new TextView(Oyun.this);
    Intent intent=getIntent();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        a=intent.getIntExtra("bolum",1);
        gv.setLayoutParams(LParams);
        btn.setLayoutParams(LParams);
        txt.setLayoutParams(LParams);
        this.setContentView(pnl);
    }
}
