package com.example.tetp_demo.hxpojo;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("videoinfor")
public class Videopojo {
    public Integer id;
    public String name;
    public String videopath;
    public String imagepath;
    public Integer episode;
    public Integer progress;

    public void setname(String cqjtu) {
        name = cqjtu;
    }

    public void setId(int i) {
        id = i;
    }
}
