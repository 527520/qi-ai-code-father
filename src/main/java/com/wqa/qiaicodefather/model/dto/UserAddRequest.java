package com.wqa.qiaicodefather.model.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @BelongsProject: qi-ai-code-father
 * @BelongsPackage: com.wqa.qiaicodefather.model.dto
 * @Author: wuqian
 * @CreateTime: 2025-08-17 19:45
 * @Description: 创建用户请求参数封装类
 * @Version: 1.0
 */
@Data
public class UserAddRequest implements Serializable {

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 用户简介
     */
    private String userProfile;

    /**
     * 用户角色: user, admin
     */
    private String userRole;

    @Serial
    private static final long serialVersionUID = 1L;
}
