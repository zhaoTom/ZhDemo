package com.bwie.zhdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt = (Button) findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.print("+++++++++++++++++++++++++++");
            }
        });
    }
}
