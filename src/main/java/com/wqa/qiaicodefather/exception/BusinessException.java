package com.wqa.qiaicodefather.exception;

import lombok.Getter;

/**
 * @BelongsProject: qi-ai-code-father
 * @BelongsPackage: com.wqa.qiaicodefather.exception
 * @Author: wuqian
 * @CreateTime: 2025-08-14 22:09
 * @Description: 自定义异常
 * @Version: 1.0
 */
@Getter
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

}
