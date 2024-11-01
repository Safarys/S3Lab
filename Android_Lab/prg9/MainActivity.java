package com.example.prg9;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1,num2;
    RadioButton add,sub,pro,div;
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        txt1 = (TextView)findViewById(R.id.res);

        add = (RadioButton) findViewById(R.id.add);
        sub = (RadioButton) findViewById(R.id.sub);
        pro = (RadioButton) findViewById(R.id.mul);
        div = (RadioButton) findViewById(R.id.div);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        pro.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.add){
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());

            String res = String.valueOf(a + b);
            txt1.setText("Sum : "+res);

        }
        else if(view.getId() == R.id.sub){
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());

            String res = String.valueOf(a - b);
            txt1.setText("Difference : "+res);

        }
        else if(view.getId() == R.id.mul){
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());

            String res = String.valueOf(a*b);
            txt1.setText("Product : "+res);

        }
        else
        {
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());

            String res = String.valueOf(a / b);
            txt1.setText("Division : "+res);

        }
    }
}
