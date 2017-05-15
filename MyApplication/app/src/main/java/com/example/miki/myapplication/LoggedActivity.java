package com.example.miki.myapplication;


        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.TextView;

public class LoggedActivity extends AppCompatActivity {

    TextView loggedUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);

       // loggedUser = (TextView) findViewById(R.id.loggedUser);

       // loggedUser.setText("Benvenuto! " + getIntent().getStringExtra("username"));

    }
}