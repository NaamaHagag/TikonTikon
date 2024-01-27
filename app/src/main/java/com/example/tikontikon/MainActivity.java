package com.example.tikontikon;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.btn1);
        btn1.setText("Click me");
        btn1.setTextSize(35);
        btn1.setTextColor(Color.BLUE);
        btn1.setBackgroundColor(Color.rgb(40,255,200));
    }

    public void Boom(View view) {
        count++;
        String str= "This is a click number:" + count;
        btn1.setText(str);
        if (count%7==0){
            btn1.setText("BOOM!");
        }
    }
}