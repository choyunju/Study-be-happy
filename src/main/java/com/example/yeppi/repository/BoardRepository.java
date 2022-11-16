package com.example.yeppi.repository;

import java.util.List;

import com.example.yeppi.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {

}