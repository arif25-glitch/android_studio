package com.arifnur.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button count_btn = (Button) findViewById(R.id.button);

        count_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView editText = (TextView) findViewById(R.id.textView);
                editText.setText("1 + 1 = 2");
                editText.setText(Integer.toString(12));
            }
        });
    }
}