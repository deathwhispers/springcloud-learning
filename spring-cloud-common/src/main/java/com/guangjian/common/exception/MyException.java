package com.guangjian.common.exception;

/**
 * @author Yanggj
 * @date 2021/4/8 22:37
 */
public class MyException extends RuntimeException {

    private String msg;
    private int code;

    public MyException() {
    }

    public MyException(String msg) {
        super(msg);
        this.msg = msg;
    }


    public MyException(String message, String msg, int code) {
        super(message);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
