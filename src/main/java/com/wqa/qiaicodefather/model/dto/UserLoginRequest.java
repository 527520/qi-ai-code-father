package com.wqa.qiaicodefather.model.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @BelongsProject: qi-ai-code-father
 * @BelongsPackage: com.wqa.qiaicodefather.model.dto
 * @Author: wuqian
 * @CreateTime: 2025-08-17 19:12
 * @Description: 用户登录请求参数封装类
 * @Version: 1.0
 */
@Data
public class UserLoginRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}

