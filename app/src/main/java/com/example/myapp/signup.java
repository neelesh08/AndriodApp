package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    EditText email_text2,password_text2 , name_edit_text;
    Button signinButton , loginButton;
    String email,password,name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        name_edit_text = (EditText)findViewById(R.id.editTextTextPersonName);
        email_text2 = (EditText)findViewById(R.id.email_edit_text2);
        password_text2 = (EditText)findViewById(R.id.password_edit_text2);
        signinButton = (Button)findViewById(R.id.sign_button2);
        loginButton = (Button)findViewById(R.id.button);
    }

    public void signup(View view) {
        name = name_edit_text.getText().toString();
        email = email_text2.getText().toString();
        password = password_text2.getText().toString();
        Log.d("MainActivity", password);
        Log.d("MainActivity", email);


        if (email.isEmpty() || password.isEmpty() || name.isEmpty()  ) {
            Toast toast = Toast.makeText(this, "enter the crediatials", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this,"Account created",Toast.LENGTH_LONG);
            toast.show();
            startActivity(new Intent(this, common_page.class));

        }
    }


    public void login(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

}