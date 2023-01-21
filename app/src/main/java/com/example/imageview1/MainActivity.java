package com.example.imageview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int num;
    Random rnd =new Random();
    ImageView images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        images = (ImageView) findViewById(R.id.images);
    }
    public void photo(View view) {
        num = rnd.nextInt(3)+1;
        switch (num) {
            case 1:
                images.setImageResource(R.drawable.photo1); break;
            case 2:
                images.setImageResource(R.drawable.photo2);break;
            case 3:
                images.setImageResource(R.drawable.photo3);break;
        }

    }
}