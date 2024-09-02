package com.example.framedemo;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
ImageView i1,i2;
TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        t=(TextView) findViewById(R.id.text1);

        i1=(ImageView) findViewById(R.id.img11);
        i2=(ImageView) findViewById(R.id.img22);
        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.img11)
        {
            i1.setVisibility(View.GONE);
            i2.setVisibility(View.VISIBLE);
            t.setVisibility(View.VISIBLE);
        }
        else
        {
            i1.setVisibility(View.VISIBLE);
            i2.setVisibility(View.GONE);
            t.setVisibility(View.GONE);
        }
    }
}