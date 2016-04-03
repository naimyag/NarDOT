package com.naimyag.rayiha.rayiha;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn,btn_lvl_1,btn_lvl_2,btn_lvl_3;

    private TextView textView;

    int l=0;

    int i=1;





    private void init(){
        btn= (Button) findViewById(R.id.button);
        btn_lvl_1=(Button) findViewById(R.id.btn_lvl_1);
        btn_lvl_2=(Button) findViewById(R.id.btn_lvl_2);
        btn_lvl_3=(Button) findViewById(R.id.btn_lvl_3);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        

        btn_lvl_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Level1.class);
                Bundle bundle = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation, R.anim.animation2).toBundle();
                bundle.putInt("level", 1);
                intent.putExtras(bundle);
                startActivity(intent, bundle);

            }
        });

        btn_lvl_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, Level1.class);
                Bundle bundle = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation, R.anim.animation2).toBundle();
                bundle.putInt("level", 2);
                intent.putExtras(bundle);
                startActivity(intent, bundle);

            }
        });


        btn_lvl_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Level1.class);
                Bundle bundle = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation, R.anim.animation2).toBundle();
                bundle.putInt("level", 3);
                intent.putExtras(bundle);
                startActivity(intent, bundle);

            }
        });



    }


}

