package com.wqa.qiaicodefather.model.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @BelongsProject: qi-ai-code-father
 * @BelongsPackage: com.wqa.qiaicodefather.model.dto
 * @Author: wuqian
 * @CreateTime: 2025-08-17 18:50
 * @Description: 用户注册请求封装类
 * @Version: 1.0
 */
@Data
public class UserRegisterRequest implements Serializable {

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

    /**
     * 确认密码
     */
    private String checkPassword;
}

