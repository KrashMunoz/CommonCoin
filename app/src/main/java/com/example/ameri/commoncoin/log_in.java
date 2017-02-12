package com.example.ameri.commoncoin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class log_in extends AppCompatActivity {
    public Button login_button;
    public void init() {

        login_button = (Button) findViewById(R.id.login_button);

    }

    public void openborrow_lend(View v) {
        Intent login = new Intent(this.getBaseContext(), borrow_lend.class);
        startActivity(login);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

    }
}
