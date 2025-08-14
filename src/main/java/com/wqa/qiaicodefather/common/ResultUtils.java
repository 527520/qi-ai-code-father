package com.wqa.qiaicodefather.common;

import com.wqa.qiaicodefather.exception.ErrorCode;

/**
 * @BelongsProject: qi-ai-code-father
 * @BelongsPackage: com.wqa.qiaicodefather.common
 * @Author: wuqian
 * @CreateTime: 2025-08-14 22:25
 * @Description: 快速构造响应结果类
 * @Version: 1.0
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param code
     * @param message
     * @return
     */
    public static BaseResponse error(int code, String message) {
        return new BaseResponse(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String message) {
        return new BaseResponse(errorCode.getCode(), null, message);
    }
}
