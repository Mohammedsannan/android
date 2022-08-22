package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    TextView t1,t2,t;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.n1);
        e2=findViewById(R.id.n2);
        b1=findViewById(R.id.b);
        b2=findViewById(R.id.button);
        b3=findViewById(R.id.button2);
        b4=findViewById(R.id.button3);
        t=findViewById(R.id.t3);
    }

    public void sum(View view) {

        float a=Float.parseFloat(String.valueOf(e1.getText()) );
        float b=Float.parseFloat(String.valueOf(e2.getText()));
        float s=a+b;
        t.setText(Float.toString(s));
    }

    public void sub(View view) {

        Float a=Float.parseFloat(String.valueOf(e1.getText()) );
        Float b=Float.parseFloat(String.valueOf(e2.getText()));
        Float s=a-b;
        t.setText(Float.toString(s));
    }

    public void mul(View view) {

        Float a=Float.parseFloat(String.valueOf(e1.getText()) );
        Float b=Float.parseFloat(String.valueOf(e2.getText()));
        Float s=a*b;
        t.setText(Float.toString(s));
    }

    public void div(View view) {

        Float a=Float.parseFloat(String.valueOf(e1.getText()) );
        Float b=Float.parseFloat(String.valueOf(e2.getText()));
        Float s=a/b;
        t.setText(Float.toString(s));
    }
}