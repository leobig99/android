package com.example.miki.trisintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Gioco extends AppCompatActivity {

    TextView parola ;
    EditText e;
    Paroliere p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gioco);
        String app=getIntent().getStringExtra("nome");
        Toast.makeText(this, app, Toast.LENGTH_SHORT).show();
        TextView t= (TextView) findViewById(R.id.testoNome);
        t.setText(app);

        parola = (TextView) findViewById(R.id.parola);
        p=new Paroliere();
        e= (EditText) findViewById(R.id.testo);

        parola.setText(p.toString());

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText("");
            }
        });

        Button b= (Button) findViewById(R.id.seleziona);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String app=e.getText().toString();
                p.controlla(app);
                parola.setText(p.toString());

                if(p.finito()){
                    Intent i = new Intent();
                    if(p.vittoria)
                        i.putExtra("vittoria", "hai vinto");
                    else
                        i.putExtra("vittoria", "hai perso");

                    Gioco.this.setResult(RESULT_OK, i);

                    Gioco.this.finish();
                }
            }
        });

    }
}
