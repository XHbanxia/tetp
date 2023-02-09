package com.example.tetp_demo.hxservice;

import org.springframework.web.multipart.MultipartFile;

public interface VideoService {
    void save(MultipartFile file, String filename,String filepath);
}
