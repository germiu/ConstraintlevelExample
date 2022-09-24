package com.example.constraint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String userName = "Isah";
    String password = "Musa";
    String otp = "abc";

    EditText editTextTextEmailAddress,editTextTextPassword2,et_otp;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextTextPassword2 = findViewById(R.id.editTextTextPassword2);
        et_otp = findViewById(R.id.et_otp);
        button=findViewById(R.id.button);
    }

    @Override
    protected void onResume() {
        super.onResume();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String use = editTextTextEmailAddress.getText().toString();
                String pass = editTextTextPassword2.getText().toString();
                String ot = et_otp.getText().toString();


                if(use.equals(userName) && pass.equals(password) && ot.equals(otp)){

                    Intent i = new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(i);

                }
                else {
                    Toast.makeText(MainActivity.this, "Please enter correct password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}