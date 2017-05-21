package com.example.phyon.a170405;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener { //멤버변수는 m으로 시작
    private Button mButtonConvert;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mButtonConvert = (Button) findViewById(R.id.main_convert_button);//view 객체에 id갑 박아버리기
        mButtonConvert.setOnClickListener(this); //리스너 달아주기
        mEditText = (EditText) findViewById(R.id.main_input_num);//view 객체에 id갑 박아버리기
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.main_convert_button) {
            int value = Integer.valueOf(mEditText.getText().toString());
            String result = String.valueOf((value - 32) / 1.8);
            mEditText.setText(result);
        }
    }
}