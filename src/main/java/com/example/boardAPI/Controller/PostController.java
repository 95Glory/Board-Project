package com.example.boardAPI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/post")
    public String test(){
        return "boardposting";
    }

}
