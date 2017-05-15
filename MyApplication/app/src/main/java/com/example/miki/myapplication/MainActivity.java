package com.example.miki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);

        loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,LoggedActivity.class);
                startActivityForResult(i, 2);
               /* if(username.getText().length() > 0){
                    Intent i = new Intent(MainActivity.this,LoggedActivity.class);
                    //i.putExtra("username",username.getText().toString());
                    startActivity(i);
                }*/
            }
        });
    }
}
