package com.example.disabilityprojectsemvi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText login_name = findViewById(R.id.login_name);
        EditText login_password = findViewById(R.id.login_password);

        if (TextUtils.isEmpty(login_name.getText().toString())) {
            Toast t = Toast.makeText(this, "You must enter username", Toast.LENGTH_SHORT);
            t.show();
        }

        if (TextUtils.isEmpty(login_password.getText().toString())) {
            Toast t = Toast.makeText(this, "You must enter password", Toast.LENGTH_SHORT);
            t.show();
        }


    }
}