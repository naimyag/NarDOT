package com.naimyag.rayiha.rayiha;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //android.os.Process.killProcess(android.os.Process.myPid());

        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        return true;
    }

    private GridView pnlGrid;
    private Bolumler bolumler;
    private BolumAdapter controller;

    private void init(){
        pnlGrid=(GridView) findViewById(R.id.pnlGrid);
        bolumler = new Bolumler();
        controller = new BolumAdapter(MainActivity.this,bolumler);
        pnlGrid.setAdapter(controller);
    }

    private void registerhandle(){

        pnlGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, Level1.class);
                Bundle bundle = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation, R.anim.animation2).toBundle();
                intent.putExtra("bolum", position+1);
                startActivity(intent,bundle);
            }
        });
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        registerhandle();


    }


}

