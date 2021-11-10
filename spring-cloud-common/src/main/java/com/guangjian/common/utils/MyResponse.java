package com.guangjian.common.utils;

import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一数据返回
 *
 * @author Yanggj
 * @date 2021/4/8 22:41
 */
public class MyResponse extends HashMap<String, Object> {

    public MyResponse() {
        put("code", 0);
        put("msg", "success");
    }

    public static MyResponse error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员！");
    }

    public static MyResponse error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static MyResponse error(int code, String msg) {
        MyResponse myResponse = new MyResponse();
        myResponse.put("code", code);
        myResponse.put("msg", msg);
        return myResponse;
    }

    public static MyResponse ok(String msg) {
        MyResponse myResponse = new MyResponse();
        myResponse.put("msg", msg);
        return myResponse;
    }

    public static MyResponse ok(Map<String, Object> map) {
        MyResponse myResponse = new MyResponse();
        myResponse.putAll(map);
        return myResponse;
    }


    public static MyResponse ok() {
        return new MyResponse();
    }

    @Override
    public MyResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
