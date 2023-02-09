package com.example.tetp_demo.hxvo;

public class Result<T> {
    public int code;
    public String message;
    public T data;

    public static <T> Result successs(){
        Result r = new Result();
        r.code = 200;
        r.message = "ok";
        return r;
    }
    public static <T> Result successs(T data){
        Result r = new Result();
        r.code = 200;
        r.message = "ok";
        r.data = data;
        return r;
    }
}
