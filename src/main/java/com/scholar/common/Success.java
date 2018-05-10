package com.scholar.common;

import java.io.Serializable;

/**
 * @author ：zhangchuanzhi
 * @Description:定义共同返回结果
 * @date ：15:09 2017/9/25
 */

public class Success<T> implements Serializable {

    private static final long serialVersionUID = 2488663702267110932L;
    private boolean success;
    private T data;


    public Success() {
    }

    public Success(T data) {
        this.data = data;
    }

    public Success(T data, boolean success) {
        this.data = data;
        this.success = success;
    }

    public static <T> Success<T> ok(T data) {
        return new Success<T>(data, true);
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", data=" + data.toString() +
                '}';
    }
}
