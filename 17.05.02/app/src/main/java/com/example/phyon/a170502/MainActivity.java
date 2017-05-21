package com.example.phyon.a170502;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText mMainInputTxt;
    private TextView mMainResult;
    private Button mMainAllClear;
    private Button mMainDivision;
    private Button mMainDelete;
    private Button mMainMultiply;
    private Button mMainSubstraction;
    private Button mMainAdd;
    private Button mMainDot;
    private Button mMainBracket;
    private Button mMainEqual;
    private Button mMain9;
    private Button mMain8;
    private Button mMain7;
    private Button mMain6;
    private Button mMain5;
    private Button mMain4;
    private Button mMain3;
    private Button mMain2;
    private Button mMain1;
    private Button mMain0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        mMainInputTxt = (EditText)findViewById(R.id.main_input_txt);
        mMainResult = (TextView)findViewById(R.id.main_result);

        mMainAllClear = (Button)findViewById(R.id.main_all_clear);
        mMainDivision = (Button)findViewById(R.id.main_division);
        mMainDelete = (Button)findViewById(R.id.main_delete);
        mMainMultiply = (Button)findViewById(R.id.main_multiply);
        mMainSubstraction = (Button)findViewById(R.id.main_subtraction);
        mMainAdd = (Button)findViewById(R.id.main_add);
        mMainDot = (Button)findViewById(R.id.main_dot);
        mMainBracket = (Button)findViewById(R.id.main_bracket);

        mMainEqual = (Button)findViewById(R.id.main_equal);

        mMain9 = (Button)findViewById(R.id.main_9);
        mMain8 = (Button)findViewById(R.id.main_8);
        mMain7 = (Button)findViewById(R.id.main_7);
        mMain6 = (Button)findViewById(R.id.main_6);
        mMain5 = (Button)findViewById(R.id.main_5);
        mMain4 = (Button)findViewById(R.id.main_4);
        mMain3 = (Button)findViewById(R.id.main_3);
        mMain2 = (Button)findViewById(R.id.main_2);
        mMain1 = (Button)findViewById(R.id.main_1);
        mMain0 = (Button)findViewById(R.id.main_0);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.main_all_clear) {
            clearViewText();
        }
        else if (v.getId() == R.id.main_equal){
            /*todo
            누르는 순간 string을 읽어와서 연산자 구분하고 브라켓 구분하고 dot구분하고
            연산해서 출력 해주기
            */
        }
        else {
            addText(v.getResources().getResourceName(v.getId());
        }
    }

    private void addText(String decision) {
        String temp = mMainInputTxt.getText().toString();
        switch (decision){
            case "main_9":
                mMainResult.setText(temp + "9");
                break;
            case "main_8":
                mMainResult.setText(temp + "8");
                break;
            case "main_7":
                mMainResult.setText(temp + "7");
                break;
            case "main_6":
                mMainResult.setText(temp + "6");
                break;
            case "main_5":
                mMainResult.setText(temp + "5");
                break;
            case "main_4":
                mMainResult.setText(temp + "4");
                break;
            case "main_3":
                mMainResult.setText(temp + "3");
                break;
            case "main_2":
                mMainResult.setText(temp + "2");
                break;
            case "main_1":
                mMainResult.setText(temp + "1");
                break;
            case "main_0":
                mMainResult.setText(temp + "0");
                break;
        }
    }

    private void clearViewText() {
        mMainResult.setText(null);
    }
}
