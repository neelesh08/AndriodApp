package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email_text,password_text;
    Button loginButton,signupButton;
    String email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email_text = (EditText)findViewById(R.id.email_edit_text);
        password_text = (EditText)findViewById(R.id.password_edit_text);
        loginButton = (Button)findViewById(R.id.login_button);
        signupButton = (Button)findViewById(R.id.button2);

    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    public void login(View view){
        email = email_text.getText().toString().trim();
        password = password_text.getText().toString().trim();
        Log.d("MainActivity", password);
        Log.d("MainActivity", email);
       if(email.isEmpty() || password.isEmpty() ){
            Toast toast = Toast.makeText(this,"enter the credentials",Toast.LENGTH_LONG);
                    toast.show();

       }
       else{
           Toast toast = Toast.makeText(this,"logged-in Successfully",Toast.LENGTH_SHORT);
           toast.show();
           startActivity(new Intent(this,common_page.class));

       }

          }


    public void signin(View view){
        startActivity(new Intent(this,signup.class));

    }

}