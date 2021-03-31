package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.tv_result);
    }

    public void onButtonClick(View v) {
        String text1 = "Всё, что нам нужно";
        String text2 = " – это ";
        String text3 = Phraser.PhraserGen();
        textView.setText(text1 + text2 + text3);

        String u1 = text3.substring(1);
        String l1 = text1.substring(1);
        String point = ".";

        text3=text3.substring(0, 1).toUpperCase() + u1; //первый символ делаем заглавным
        text1=text1.substring(0, 1).toLowerCase() +l1 + point; //первый символ делаем строчным

        textView2.setText(text3 + text2 + text1);


    }

}