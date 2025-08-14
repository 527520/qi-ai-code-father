package com.wqa.qiaicodefather.exception;

/**
 * @BelongsProject: qi-ai-code-father
 * @BelongsPackage: com.wqa.qiaicodefather.exception
 * @Author: wuqian
 * @CreateTime: 2025-08-14 22:11
 * @Description: 抛异常工具类
 * @Version: 1.0
 */
public class ThrowUtils {

    /**
     * 条件成立则抛异常
     *
     * @param condition
     * @param runtimeException
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    /**
     * 条件成立则抛异常
     *
     * @param condition
     * @param errorCode
     */
    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    /**
     * 条件成立则抛异常
     *
     * @param condition
     * @param errorCode
     * @param message
     */
    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition, new BusinessException(errorCode, message));
    }
}
