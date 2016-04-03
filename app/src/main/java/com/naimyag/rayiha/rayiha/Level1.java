package com.naimyag.rayiha.rayiha;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Level1 extends AppCompatActivity {
//naim ebene atlayayım
    private Bundle extras=null;
    Adapter adp;
    GridView gv;
    int[] imgs={R.drawable.iki,R.drawable.iki,R.drawable.iki,R.drawable.iki,
            R.drawable.iki,R.drawable.iki,R.drawable.iki,R.drawable.iki,
            R.drawable.iki,R.drawable.iki,R.drawable.iki,R.drawable.iki,
            R.drawable.iki,R.drawable.iki,R.drawable.iki,R.drawable.iki};

    private TextView textView;
    Button btn;

    int l=0;
    int i=1;
    int a=1;


    private void RenkDegistir(int pos){
        if (imgs[pos] == R.drawable.dort) {
            imgs[pos] = R.drawable.uc;
            gv.setAdapter(adp);

        } else if (imgs[pos] == R.drawable.uc) {
            imgs[pos] = R.drawable.iki;
            gv.setAdapter(adp);

        } else if (imgs[pos] == R.drawable.iki) {
            imgs[pos] = R.drawable.dort;
            gv.setAdapter(adp);

        }

    }


    private void init(){

        btn= (Button) findViewById(R.id.button);

        gv= (GridView) findViewById(R.id.gridView);

        for(l=0;l<16;l++)
        {

            imgs[l]=R.drawable.iki;

        }

        gv.setNumColumns((int) Math.sqrt(imgs.length));
        gv.setColumnWidth((int) (Math.sqrt(imgs.length)));


        textView= (TextView) findViewById(R.id.textView);

        adp=new Adapter(this,imgs);
        gv.setAdapter(adp);




    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        init();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Level1.this, MainActivity.class);
                Bundle bundle = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.saga, R.anim.soldan).toBundle();
                startActivity(intent, bundle);

            }
        });

        extras=getIntent().getExtras();
        a=extras.getInt("level");

        switch (a){
            case 1:
                imgs[0] = R.drawable.iki; imgs[1] = R.drawable.uc; imgs[2] = R.drawable.iki; imgs[3] = R.drawable.iki;
                imgs[4] = R.drawable.uc;  imgs[5] = R.drawable.uc; imgs[6] = R.drawable.uc;imgs[7] = R.drawable.iki;
                imgs[8] = R.drawable.iki; imgs[9] = R.drawable.uc; imgs[10] = R.drawable.iki; imgs[11] = R.drawable.iki;
                imgs[12] = R.drawable.iki;imgs[13] = R.drawable.iki;imgs[14] = R.drawable.iki;imgs[15] = R.drawable.iki;

                gv.setAdapter(adp);
                break;
            case 2:
                imgs[0] = R.drawable.iki; imgs[1] = R.drawable.uc; imgs[2] = R.drawable.iki; imgs[3] = R.drawable.uc;
                imgs[4] = R.drawable.uc;  imgs[5] = R.drawable.uc; imgs[6] = R.drawable.dort;imgs[7] = R.drawable.uc;
                imgs[8] = R.drawable.iki; imgs[9] = R.drawable.uc; imgs[10] = R.drawable.iki; imgs[11] = R.drawable.uc;
                imgs[12] = R.drawable.iki;imgs[13] = R.drawable.iki;imgs[14] = R.drawable.iki;imgs[15] = R.drawable.iki;

                gv.setAdapter(adp);
                break;
            case 3:
                imgs[0] = R.drawable.iki; imgs[1] = R.drawable.uc; imgs[2] = R.drawable.iki; imgs[3] = R.drawable.uc;
                imgs[4] = R.drawable.uc;  imgs[5] = R.drawable.uc; imgs[6] = R.drawable.dort;imgs[7] = R.drawable.dort;
                imgs[8] = R.drawable.iki; imgs[9] = R.drawable.uc; imgs[10] = R.drawable.uc; imgs[11] = R.drawable.dort;
                imgs[12] = R.drawable.iki;imgs[13] = R.drawable.iki;imgs[14] = R.drawable.iki;imgs[15] = R.drawable.uc;

                gv.setAdapter(adp);
                break;

        }


        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {


                textView.setText("Tıklama sayısı: " + i);
                i++;


                String[] dizi = ((String) v.getTag()).split("-");

                int s = (int) Math.sqrt(imgs.length);
                int y = Integer.parseInt(dizi[1]);
                int x = Integer.parseInt(dizi[0]);


                List<Integer> imgdizi = new ArrayList<Integer>();
                imgdizi.add((x - 1) * s + y);
                if (!dizi[1].equals("1")) {
                    imgdizi.add((x - 1) * s + y - 1);
                }
                if (!dizi[1].equals(String.valueOf(s))) {
                    imgdizi.add((x - 1) * s + y + 1);
                }
                if (!dizi[0].equals("1")) {
                    imgdizi.add((x - 1) * s + y - s);
                }
                if (!dizi[0].equals(String.valueOf(s))) {
                    imgdizi.add((x - 1) * s + y + s);
                }

                for (int sayi : imgdizi) {
                    RenkDegistir(sayi - 1);
                }

                if (imgs[0] == R.drawable.iki && imgs[1] == R.drawable.iki && imgs[2] == R.drawable.iki && imgs[3] == R.drawable.iki
                        && imgs[4] == R.drawable.iki && imgs[5] == R.drawable.iki && imgs[6] == R.drawable.iki && imgs[7] == R.drawable.iki
                        && imgs[8] == R.drawable.iki && imgs[9] == R.drawable.iki && imgs[10] == R.drawable.iki && imgs[11] == R.drawable.iki
                        && imgs[12] == R.drawable.iki && imgs[13] == R.drawable.iki && imgs[14] == R.drawable.iki && imgs[15] == R.drawable.iki) {
                    Toast.makeText(Level1.this, "BÖLÜM GEÇİLDİ!", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(Level1.this, MainActivity.class);
                    Bundle bundle = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.saga, R.anim.soldan).toBundle();
                    startActivity(intent, bundle);

                }


            }
        });


    }
}
