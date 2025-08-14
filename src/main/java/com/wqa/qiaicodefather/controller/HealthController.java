package com.wqa.qiaicodefather.controller;

import com.wqa.qiaicodefather.common.BaseResponse;
import com.wqa.qiaicodefather.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wuqian
 * @description:
 * @date: 2025-08-13
 * @modified:
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/check")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("ok!");
    }
}
