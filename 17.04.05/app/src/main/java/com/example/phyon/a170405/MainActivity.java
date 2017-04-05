package com.example.phyon.a170405;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButtonConvert;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mButtonConvert = (Button) findViewById(R.id.main_convert_button);
        mButtonConvert.setOnClickListener(this);
        mEditText = (EditText)findViewById(R.id.main_input_num);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.main_convert_button) {
            int value = Integer.valueOf(mEditText.getText().toString());
            String result = String.valueOf((value- 32) / 1.8);
                mEditText.setText(result);
        }
    }


    //