package com.wqa.qiaicodefather.common;

import com.wqa.qiaicodefather.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @BelongsProject: qi-ai-code-father
 * @BelongsPackage: com.wqa.qiaicodefather.exception
 * @Author: wuqian
 * @CreateTime: 2025-08-14 22:11
 * @Description: 通用响应类
 * @Version: 1.0
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}