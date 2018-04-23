package com.gythwanjohi.githinjiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    Button btnSignIn_SignIn, btnCreateAc_SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnSignIn_SignIn = (Button)  findViewById(R.id.btnSignIn_SignIn);
        btnCreateAc_SignIn = (Button) findViewById(R.id.btnCreateAc_SignIn);

        btnSignIn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn.this, "Signing you in", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignIn.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnCreateAc_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this,CreateAccount.class);
                startActivity(intent);
            }
        });

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

}
