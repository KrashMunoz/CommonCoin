package com.example.ameri.commoncoin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign_up extends AppCompatActivity {
    public Button signup_doneb;
    public void init() {
        signup_doneb = (Button) findViewById(R.id.signup_doneb);
    }

    public void openadd_payment_method(View v) {
        Intent login = new Intent(this.getBaseContext(), add_payment_method.class);
        startActivity(login);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
}
