package com.yaya.toytiger.entity;

import lombok.Data;

@Data
public class Result {
    private String reutlt;
    private String code;
    private Object message;

    public static Result success(Object message){
        Result result = new Result();
        result.setCode("200");
        result.success("success");
        result.setMessage(message);
        return result;
    };
}
