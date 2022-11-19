package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button btn2;
    TextView t2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn2=findViewById(R.id.b2);
        t2=findViewById(R.id.txt2);
    }

    public void button(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
