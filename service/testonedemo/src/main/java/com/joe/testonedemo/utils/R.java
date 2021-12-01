package com.joe.testonedemo.utils;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class R {

    @ApiModelProperty(value = "返回码")
    private int code = 200;
    private String msg ="成功";
    private Object data;

    public R() {
    }

    public static R error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error(500, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.setMsg(msg);
        return r;
    }

    public static R ok(Object data) {
        R r = new R();
        r.setData(data);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
