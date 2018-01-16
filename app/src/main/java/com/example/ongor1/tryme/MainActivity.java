package com.example.ongor1.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowview;
    private Button tryButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new  int[]{
                Color.CYAN,Color.GREEN,Color.RED,Color.BLUE,
                Color.BLACK,Color.DKGRAY,Color.LTGRAY,Color.MAGENTA,Color.YELLOW
        };

        windowview = findViewById(R.id.windowviewId);
        windowview.setBackgroundColor(Color.DKGRAY);

        tryButton = (Button)findViewById(R.id.tryButton);
        tryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int colorArrayLenght = colors.length;
                Random random = new Random();
                int randomNum = random.nextInt(colorArrayLenght);

                windowview.setBackgroundColor(colors[randomNum]);
            }
        });

    }
}
