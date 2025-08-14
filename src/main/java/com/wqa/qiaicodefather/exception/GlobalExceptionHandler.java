package com.wqa.qiaicodefather.exception;

import com.wqa.qiaicodefather.common.BaseResponse;
import com.wqa.qiaicodefather.common.ResultUtils;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @BelongsProject: qi-ai-code-father
 * @BelongsPackage: com.wqa.qiaicodefather.exception
 * @Author: wuqian
 * @CreateTime: 2025-08-14 22:27
 * @Description: 全局异常处理器
 * @Version: 1.0
 */
@Hidden
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("BusinessException", e);
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, "系统错误");
    }
}
