package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements TextWatcher, View.OnClickListener, CompoundButton.OnCheckedChangeListener {
EditText percent;
CheckBox c;
ToggleButton t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            //Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            //v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            //return insets;
        //});
        percent=(EditText)findViewById(R.id.edit1);
        percent.addTextChangedListener(this);
        c=(CheckBox) findViewById(R.id.cb);
        c.setOnClickListener(this);
        t1=(ToggleButton) findViewById(R.id.tb);
        t1.setOnCheckedChangeListener(this);
    }



    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
    float num=0;
    String s=editable.toString();
    if(s!=null && !s.isEmpty())
        num=Float.parseFloat(editable.toString());
    if(num>100)
        editable.replace(0,editable.length(),"100");
    }

    @Override
    public void onClick(View view) {
        if(c.isChecked())
            Toast.makeText(this,"Terms Applied",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,"Accept Terms and Conditions ",Toast.LENGTH_LONG).show();

    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b)
        {
            t1.setBackgroundColor(Color.DKGRAY);
            c.setTextColor(Color.WHITE);
            percent.setTextColor(Color.WHITE);
        }
        else {
            t1.setBackgroundColor(Color.LTGRAY);
            c.setTextColor(Color.BLACK);
            percent.setTextColor(Color.BLACK);
        }
    }
}