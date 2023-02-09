package com.example.tetp_demo.hxpojo;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("peopinfo")
public class Peoppojo {
    public Integer id;
    public String peopusername;
    public String peoppasword;
    public String peopname;
    public String email;
    public String telepen;
    public String peoppicurl;

    public void setId(int i) {
        id = i;
    }

    public void setPicUrl(String s) {
        peoppicurl = s;
    }
}
