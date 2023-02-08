package com.example.tetp_demo.hx.conc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hx")
public class login {
    @GetMapping("/api")
    public String loginmasseg(){
        return "this is login pig";
    }
    @PostMapping("/loginad")
    public String adminstring(){
        return "a";
    }

    @GetMapping("/videolist")
    public String getvideolist(){
        return "a";
    }

}
