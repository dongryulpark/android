package com.example.phyon.a20170524board;

import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by phyon on 2017-05-24.
 */

public class BoardController {
    public static String createBoard(String boardUid, String boardTitle, String boardContent, String makedDate){
        String boardKey = FirebaseDatabase.getInstance().getReference().child("board").push().getKey();

        Board board = new Board(boardUid);

        Map<String, Object> boardValues = board.toMap();
        Map<String, Object> childUpdates = new HashMap<>();

        childUpdates.put("/boards/" + boardUid, boardValues);

        FirebaseDatabase.getInstance().getReference().updateChildren(childUpdates);

        return boardKey;
    }

    public static void editBoard(String boardUid, Map<String, Object> updateValues) {
        FirebaseDatabase.getInstance().getReference().child("boards").child(boardUid).updateChildren(updateValues);
    }

    public static void updateUser(String boardUid, String boardTitle, String boardContent, String makedDate) {
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("boardUid", boardUid);
        childUpdates.put("boardTitle", boardTitle);
        childUpdates.put("boardContent", boardContent);
        childUpdates.put("boardData", makedDate);


        editBoard(boardUid, childUpdates);
    }

}
