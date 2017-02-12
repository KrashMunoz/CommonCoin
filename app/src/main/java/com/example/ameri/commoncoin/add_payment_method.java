package com.example.ameri.commoncoin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class add_payment_method extends AppCompatActivity {
    public Button button;
    public void init() {
        button = (Button) findViewById(R.id.button);
    }

    public void openborrow_lend(View v) {
        Intent login = new Intent(this.getBaseContext(), borrow_lend.class);
        startActivity(login);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_payment_method);
    }
}
