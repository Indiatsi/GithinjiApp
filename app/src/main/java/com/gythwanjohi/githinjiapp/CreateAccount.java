package com.gythwanjohi.githinjiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {
    Button btnLogin_SignUp, btnCreateAc_SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnLogin_SignUp = (Button)  findViewById(R.id.btnLogin_SignUp);
        btnCreateAc_SignUp = (Button) findViewById(R.id.btnCreateAccount_SignUp);

        btnLogin_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(CreateAccount.this, "Signing you in", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CreateAccount.this,SignIn.class);
                startActivity(intent);
            }
        });

        btnCreateAc_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreateAccount.this, "Creating your account", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CreateAccount.this,SignIn.class);
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
