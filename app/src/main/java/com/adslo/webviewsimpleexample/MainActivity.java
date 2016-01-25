package com.adslo.webviewsimpleexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnNaver;
    private Button btnDaum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNaver = (Button)findViewById(R.id.button);
        btnNaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("url", "http://www.naver.com");
                startActivity(i);
            }
        });

        btnDaum = (Button)findViewById(R.id.button2);
        btnDaum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("url", "http://www.daum.net");
                startActivity(i);

            }
        });
    }
}
