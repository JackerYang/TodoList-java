package com.yangshiwei.todolist.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result {
    private int status;
    private String msg;
    private Object data;
    public static Result ok (Object data) {
        return new Result(200, "", data);
    }
    public static Result ok () {
        return new Result(200, "", null);
    }
}
