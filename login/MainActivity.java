package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText a,b;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.e1);
        b=findViewById(R.id.e2);
        b1=(Button) findViewById(R.id.b);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String U=a.getText().toString();
                String P=b.getText().toString();
                if(U.equals("sanan") && P.equals("1234"))
                {
                    Toast.makeText(MainActivity.this, "login successfully", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "login failed", Toast.LENGTH_SHORT).show();
                }
             }
        });
    }
}