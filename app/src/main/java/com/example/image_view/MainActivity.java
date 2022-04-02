package com.example.image_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView imageView;
    Random rnd = new Random();
    int j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView1);

    }

    public void go(View view) {
        j = rnd.nextInt(3) + 1;
        if (j == 1) {
            imageView.setImageResource(R.drawable.v1);
            btn.setText("1");
        }
        if (j == 2) {
            imageView.setImageResource(R.drawable.v2);
            btn.setText("2");
        }
        if (j == 3) {
            imageView.setImageResource(R.drawable.v3);
            btn.setText("3");
        }
    }
}