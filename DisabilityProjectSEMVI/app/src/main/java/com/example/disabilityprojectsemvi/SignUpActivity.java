package com.example.disabilityprojectsemvi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public void check()
    {
        EditText login_name = findViewById(R.id.login_name);
        EditText login_email = findViewById(R.id.login_email);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        EditText confirm_password = findViewById(R.id.confirm_password);
        if (TextUtils.isEmpty(login_name.getText().toString())) {
            Toast t = Toast.makeText(this, "You must enter your name", Toast.LENGTH_SHORT);
            t.show();
        }
        if (TextUtils.isEmpty(login_email.getText().toString())) {
            Toast t = Toast.makeText(this, "You must enter email ID", Toast.LENGTH_SHORT);
            t.show();
        }
        if (TextUtils.isEmpty(username.getText().toString())) {
            Toast t = Toast.makeText(this, "You must enter a username", Toast.LENGTH_SHORT);
            t.show();
        }
        if (TextUtils.isEmpty(password.getText().toString())) {
            Toast t = Toast.makeText(this, "You must enter a password", Toast.LENGTH_SHORT);
            t.show();
        }
        if(password.getText().toString().length() <= 8)
        {
            Toast.makeText(this, "Password must be greater than 8 characters", Toast.LENGTH_SHORT).show();
        }
        if(password.getText().toString().length() > 8 && (password.getText().toString() == confirm_password.getText().toString()))
        {
            Toast.makeText(this, "Password and confirm password do not match", Toast.LENGTH_SHORT).show();
        }
    }
}