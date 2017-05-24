package com.example.phyon.a20170524board;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by phyon on 2017-05-24.
 */

public class Board {
    public String boardUid;
    public String boardTitle;
    public String boardContent;
    public String makedDate;

    public Board(){
    }

    public Board(String boardUid, String boardTitle, String boardContent, String makedDate){
        this.boardUid = boardUid;
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
        this.makedDate = makedDate;
    }

    public Board(String boardUid){this.boardUid = boardUid;}

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("boardUid", boardUid);
        result.put("boardTitle", boardTitle);
        result.put("boardContent", boardContent);
        result.put("boardData", makedDate);

        return result;
    }


    @Exclude
    public static Board parseSnapshot(DataSnapshot snapshot) {
        Board board = new Board();
        board.boardUid = (String)snapshot.child("boardUid").getValue();
        board.boardTitle = (String) snapshot.child("boardTitle").getValue();
        board.boardContent = (String) snapshot.child("boardContent").getValue();
        board.makedDate = (String) snapshot.child("boardData").getValue();
        return board;
    }
}
