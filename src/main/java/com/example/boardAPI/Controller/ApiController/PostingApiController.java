package com.example.boardAPI.Controller.ApiController;

import com.example.boardAPI.Model.Board;
import com.example.boardAPI.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostingApiController {

    @Autowired
    PostService postService;

    //게시글 삭제
    @DeleteMapping("remove/{id}")
    public void remove(@PathVariable int id){
        postService.remove(id);
    }

    //게시글 수정
    @PutMapping("update/{id}")
    public Board update(@PathVariable int id,@RequestBody Board board){
        System.out.println("RestController에서 받은 board : "+board);
        Board updateBoard=postService.update(id,board);
        return updateBoard;
    }


//    실제로 사용x 해당 api는 html에서 action을 통해 바로실행

    //게시글 작성
    @PostMapping("/posting")
    public Board posting(Board board){
        Board posted = postService.posting(board);
        return posted;
    }

    //게시글 리스트 보기
    @GetMapping("/board/list")
    public List<Board> boardList(){
        List<Board> boardList = postService.findAll();
        return boardList;
    }
}