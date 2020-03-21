package com.vineetishansarish.trainerandtraineeap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import vineetishansarish.trainerandtraineeapp.HomeActivity;
import vineetishansarish.trainerandtraineeapp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername =  (EditText) findViewById(R.id.etUsername);
        final EditText etPassword =  (EditText) findViewById(R.id.etPassword);
        final Button bLogin=  (Button) findViewById(R.id.bLogin);
        final TextView registerlink = (TextView) findViewById(R.id.tvRegisterHere);



                registerlink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                        LoginActivity.this.startActivity(registerIntent);
                    }
                });
            }

    public void sendMessage(View view) {

        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
    }
        }
