package com.example.yeppi.service;

import java.util.List;

import com.example.yeppi.entity.Board;
import com.example.yeppi.repository.BoardRepository;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    // get boards data
    public List<Board> getAllBoard() {
        return boardRepository.findAll();
    }

    // create board
    public Board createBoard(Board board) {
        return boardRepository.save(board);
    }

    // get board one by id
    public ResponseEntity<Board> getBoard(Integer no) {
        Board board = boardRepository.findById(no)
                .orElseThrow();
        return ResponseEntity.ok(board);
    }

    // get board
    public Board getOneBoard(Integer no) {
        Board board = boardRepository.findById(no).orElseThrow();
        return board;
    }


}
