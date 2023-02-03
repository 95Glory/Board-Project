package com.example.boardAPI.Repository;

import com.example.boardAPI.Model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Board,Integer> {
}
