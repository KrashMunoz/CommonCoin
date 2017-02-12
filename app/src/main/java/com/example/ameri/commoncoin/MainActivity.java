package com.example.ameri.commoncoin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button button_1;
    public Button button2;
        public void init(){
            button_1= (Button)findViewById(R.id.button_1);
            button2= (Button)findViewById(R.id.button2);
            button_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent toy = new Intent(MainActivity.this, Sign_up.class);

                    startActivity(toy);

                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent boy = new Intent(MainActivity.this, log_in.class);

                    startActivity(boy);

                }
            });
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
