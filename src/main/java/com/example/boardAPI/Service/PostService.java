package com.example.boardAPI.Service;

import com.example.boardAPI.Model.Board;
import com.example.boardAPI.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    @Transactional
    public Board posting(Board board){
        Board posted = postRepository.save(board);
        return posted;
    }

    @Transactional
    public void remove(int id){
        postRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Board> findAll(){
        List<Board> boardList = postRepository.findAll();
        return boardList;
    }

    @Transactional(readOnly = true)
    public Board postView(int id){
        Board post = postRepository.getById(id);
        return post;
    }

    @Transactional
    public Board update(int id, Board board) {

        Board originBoard = postRepository.getById(id);

        originBoard.setTitle(board.getTitle());

        originBoard.setContent(board.getContent());
        originBoard.setNickname(board.getNickname());

//        System.out.println(originBoard);
//
//        Board updateBoard = postRepository.save(originBoard);
        //질문 Transactional 은 데이터값의 변동이 있으면 기존 DB에 알아서 바꿔준다
        //때문에 따로 save를 하지 않았고, 실제로 DB값은 변동이 되었지만
        //postman에서 x-www-form-urlencoded 타입으로 Key, Value 값으로 데이터를 날렸을때,
        //에러가 뜬다. 하지만 값은 바뀐다...
        //왜 이런 현상이 나타났을까?

        return originBoard;
    }

}
