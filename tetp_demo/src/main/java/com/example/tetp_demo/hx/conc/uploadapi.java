package com.example.tetp_demo.hx.conc;

import com.example.tetp_demo.hxmapper.PeopinfoMapper;
import com.example.tetp_demo.hxpojo.Peoppojo;
import com.example.tetp_demo.hxservice.VideoService;
import com.example.tetp_demo.hxvo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Slf4j
@RequestMapping("/api")
public class uploadapi {

    @Autowired
    private VideoService storageService;

    @PostMapping(value = "uploadvideo")
    public Result uploadvideo(HttpServletRequest request, HttpServletResponse response){
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("videofile");
        assert file != null;
        String filename = file.getOriginalFilename();
        System.out.println(filename);
        storageService.save(file,filename,"/media/video");
        return Result.successs();
    }

    @PostMapping(value = "uploadimage")
    public Result uploadimage(HttpServletRequest request, HttpServletResponse response){
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("imagefile");
        assert file != null;
        String filename = file.getOriginalFilename();
        System.out.println(filename);
        storageService.save(file,filename,"/media/image");
        return Result.successs();
    }

    @Autowired
    private PeopinfoMapper peopinfoMapper;
    @PostMapping(value = "uploadpic/{id}")
    public Result uploadpeopimage(HttpServletRequest request, HttpServletResponse response, @PathVariable String id){
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("imagefile");
        assert file != null;
        String filename = id+file.getOriginalFilename();
        System.out.println(filename);
        storageService.save(file,filename,"/media/image/");
        Peoppojo peoppicname = new Peoppojo();
        peoppicname.setPicUrl("http://43.137.14.18:8233/api/image/"+filename);
        return Result.successs(peoppicname.peoppicurl);
    }
}
