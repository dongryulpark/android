package com.example.phyon.borad;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by phyon on 2017-05-20.
 */

public class Board {
    public String boardUid;
    public String title;

    public String contents;

    public Board(){
    }

    public Board(String title, String contents){
        this.title = title;
        this.contents = contents;
    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("boardUid", boardUid);
        result.put("board_title", title);
        result.put("board_contents", contents);
    }

    @Exclude
    public static Board parseSnapshot(DataSnapshot snapshot) {
        Board board = new Board();
        board.boardUid = (String) snapshot.child("callvan_name").getValue();
        board.title = (String) snapshot.child("callvan_phone_num").getValue();
        board.contents = (String) snapshot.child("callvan_call_count").getValue();

        return contact;
    }

}
