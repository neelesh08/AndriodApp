package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {


    TextView email_ouput , password_ouput;
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
        email_ouput =  (TextView)findViewById(R.id.email_checker);
        password_ouput = (TextView)findViewById(R.id.password_checker);

    }





    public void login(View view){
        email = email_text.getText().toString().trim();
        password = password_text.getText().toString().trim();
        Log.d("MainActivity", password);
        Log.d("MainActivity", email);

       if(password.isEmpty() || email.isEmpty() ){
           Toast toast = Toast.makeText(this, "fields cannot be empty", Toast.LENGTH_SHORT);
           toast.show();

       }



       else {


           if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
               email_ouput.setText("Enter valid email");
           } else {
               Toast toast = Toast.makeText(this, "logged-in Successfully", Toast.LENGTH_SHORT);
               toast.show();
               startActivity(new Intent(this, common_page.class));

           }
       }
    }


    public void signin(View view){
        startActivity(new Intent(this,signup.class));

    }




}