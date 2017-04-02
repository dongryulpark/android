package com.example.phyon.a17041;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mButtonConvert;
    private EditText mEditText = (EditText)findViewById(R.id.main_input_num);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonConvert = (Button) findViewById(R.id.main_convert_button);
        mButtonConvert.setOnClickListener(this);
    }

    public void onClick(View view) {
        //double mvalue = Integer.parseInt(mEditText.getText().toString());
        switch (view.getId()) {
            case R.id.main_convert_button:
                //mvalue = (mvalue - 32) / 1.8;
                mEditText.setText("what");
        }
    }
}
/*public class Layout extends Activity implements View.OnClickListener
{
    public void onCreate(Bundle savedInstanceState)
    {
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button btnApple=(Button)findViewById(R.id.apple);
		btnApple.setOnClickListener(this);
		Button btnOrange=(Button)findViewById(R.id.orange);
		btnOrange.setOnClickListener(this);
    }


}
*/

