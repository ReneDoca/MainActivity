package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.constraintLayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout bgElement = findViewById(R.id.activity_main);
        bgElement.setBackgroundColor(Color.RED);
        MyButtonListenerMethod();
    }

    public void myButtonListenerMethod() {
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()) {
            public void onClick (View v){

                constraintLayout bgElement =
                        findViewById(R.id.activity_main)
                int color =
                        ((ColorDrawable) bgElement.getBackground()).getcolor();
                if (color == Color.RED) bgElement.setBackgroundColor(Color.BLUE);
                else bgElement.setBackgroundColor(Color.RED);

            });

        }
