package com.example.ameri.commoncoin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class borrow_lend extends AppCompatActivity {

    public Button borrow_button;
    Button lend_button;
    public void init() {
        borrow_button = (Button) findViewById(R.id.borrow_button);
        lend_button = (Button) findViewById(R.id.lend_button);
    }
    public void openlending(View v) {
        Intent please = new Intent(this.getBaseContext(), lending.class);
        startActivity(please);
    }
    public void openBorrow_Page(View v) {
        Intent login = new Intent(this.getBaseContext(), Borrow_Page.class);
        startActivity(login);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrow_lend);
    }
}
