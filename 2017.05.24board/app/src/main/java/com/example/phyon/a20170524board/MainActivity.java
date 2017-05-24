package com.example.phyon.a20170524board;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


// TODO: 2017-05-20
// 게시판 애플리케이션 제작


// 게시물 모델링
    /*
    제목, 내용, 날짜, 작성자 등등...
     [v]
     */

// 모델 컨트롤러 구현
    /*
    Firebase를 이용해 컨트롤러 구현
     */

// 게시물 목록 띄우기
    /*
        ListView
        - Adapter
        - item
            - Layout
     */

// 2) 게시물 확인하기
    /*
    layout
        text viwe // 제목
        text view // 내용
     */

// 4) 게시물 쓰기
    /*
        edittext //  제목
        edittext //  내용
     */
//

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
