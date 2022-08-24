package com.example.formvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText f, l, pass;
    RadioGroup gen;
    RadioButton m, fm;
    Switch nm;
    CheckBox ia;
    Button sub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f = findViewById(R.id.e1);
        l = findViewById(R.id.e2);
        pass = findViewById(R.id.e3);
        gen = findViewById(R.id.r);
        m = findViewById(R.id.r1);
        fm = findViewById(R.id.r2);
        nm = findViewById(R.id.s1);
        ia = findViewById(R.id.c1);
        sub = findViewById(R.id.b);
    }

    public void submit(View view){
        if (validate()) {
            Toast.makeText(this, "registration successfull", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validate(){
        Boolean isvalid = false;
        String firstname, lastname;
        firstname = f.getText().toString();
        lastname = l.getText().toString();

        if (firstname.equals("")) {
            Toast.makeText(this, "first name is empty!", Toast.LENGTH_SHORT).show();
        } else if (lastname.equals("")) {
            Toast.makeText(this, "last name is empty!", Toast.LENGTH_SHORT).show();
        } else if (!m.isChecked() && !fm.isChecked()) {
            Toast.makeText(this, "please choose gender!", Toast.LENGTH_SHORT).show();
        } else if (pass.length()<3) {
            Toast.makeText(this, "password should have atleast 3 character!", Toast.LENGTH_SHORT).show();
        } else if (!nm.isChecked()) {
            Toast.makeText(this, "switch on to new member", Toast.LENGTH_SHORT).show();
        } else if (!ia.isChecked()) {
            Toast.makeText(this, "agree the term and condition!", Toast.LENGTH_SHORT).show();
        } else {
           return isvalid = true;
        }
        return isvalid;

    }
}