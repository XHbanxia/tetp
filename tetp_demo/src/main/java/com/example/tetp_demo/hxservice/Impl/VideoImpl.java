package com.example.tetp_demo.hxservice.Impl;

import com.example.tetp_demo.hxservice.VideoService;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class VideoImpl implements VideoService {
    @Override
    public void save(MultipartFile file,String filename, String filepath){
        String path = filepath+filename;
        File targetfile = new File(path);
        if(! targetfile.getParentFile().exists()){
            targetfile.getParentFile().mkdirs();
        }

        try {
            FileCopyUtils.copy(file.getBytes(),targetfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
