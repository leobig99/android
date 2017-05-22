package com.example.miki.parolierefinale;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static final int code=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b= (Button) findViewById(R.id.inizio);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Gioco.class);
                EditText e = (EditText) findViewById(R.id.editText);
                String app=e.getText().toString();
                i.putExtra("nome", app);
                startActivityForResult(i, code);

            }
        });


    }

    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        if (requestCode == code) {

            if (resultCode == RESULT_OK) {

                Toast.makeText(this, data.getStringExtra("vittoria"),

                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}
