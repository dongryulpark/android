package com.example.phyon.borad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private BoardAdpater mBoardAdpater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.main_listview);
        mBoardAdpater = new BoardAdpater();
        mListView.setAdapter(mBoardAdpater);
    }
}
