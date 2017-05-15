package com.example.miki.prova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView t;

    GiocoTris g ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        g=new GiocoTris();

    }

    public void gioco(View view) {
       //
        String valore="";
        int value=view.getId();
        switch (value){
            case R.id.button:
                g.mossa(0);
                valore=g.campo[0];
                break;

            case R.id.button1:
                g.mossa(1);
                valore=g.campo[1];
                break;
            case R.id.button2:
                g.mossa(2);
                valore=g.campo[2];
                break;
            case R.id.button3:
                g.mossa(3);
                valore=g.campo[3];
                break;
            case R.id.button4:
                g.mossa(4);
                valore=g.campo[4];
                break;
            case R.id.button5:
                g.mossa(5);
                valore=g.campo[5];
                break;
            case R.id.button6:
                g.mossa(6);
                valore=g.campo[6];
                break;
            case R.id.button7:
                g.mossa(7);
                valore=g.campo[7];
                break;
            case R.id.button8:
                g.mossa(8);
                valore=g.campo[8];
                break;

        }
        Button but=((Button) findViewById(view.getId()));
        but.setText(valore);
        but.setEnabled(false);
        String app=g.isVittoria();
        if(!app.equals("")){
            Toast.makeText(MainActivity.this,app+" ha vinto", Toast.LENGTH_LONG).show();
            disableAll();
        }

    }

    public void disableAll(){
        ((Button) findViewById(R.id.button)).setEnabled(false);
        ((Button) findViewById(R.id.button1)).setEnabled(false);
        ((Button) findViewById(R.id.button2)).setEnabled(false);
        ((Button) findViewById(R.id.button3)).setEnabled(false);
        ((Button) findViewById(R.id.button4)).setEnabled(false);
        ((Button) findViewById(R.id.button5)).setEnabled(false);
        ((Button) findViewById(R.id.button6)).setEnabled(false);
        ((Button) findViewById(R.id.button7)).setEnabled(false);
        ((Button) findViewById(R.id.button8)).setEnabled(false);
    }

}
