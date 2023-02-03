package com.example.boardAPI.Controller;

import com.example.boardAPI.Model.Board;
import com.example.boardAPI.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    PostService postService;

    //게시글목록 및 홈
    @GetMapping("/")
    public String boardList(Model model){

        List<Board> posts = postService.findAll();

        model.addAttribute("posts",posts);

        return "home";
    }

    //게시글 작성 페이지 리턴
    @GetMapping("/post")
    public String posting(){
        return "posting";
    }

    //하나의 게시글 자세히 보기
    @GetMapping("/post/view/{id}")
    public String posted(@PathVariable int id,Model model){
        Board post = postService.postView(id);
        model.addAttribute("post",post);
        return "postview";
    }

    //게시글 수정
    @GetMapping("/update/post/{id}")
    public String update(@PathVariable int id,Model model){
        System.out.println("Controller에서 받은 id : " + id);
        Board post = postService.postView(id);
        System.out.println("Controller에서 받은 id로 찾아낸 post : " + post);
        model.addAttribute("post",post);
        return "update";
    }
}
