package com.wqa.qiaicodefather.model.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @BelongsProject: qi-ai-code-father
 * @BelongsPackage: com.wqa.qiaicodefather.model.dto
 * @Author: wuqian
 * @CreateTime: 2025-08-17 19:46
 * @Description: 用户更新请求封装类
 * @Version: 1.0
 */
@Data
public class UserUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 简介
     */
    private String userProfile;

    /**
     * 用户角色：user/admin
     */
    private String userRole;

    @Serial
    private static final long serialVersionUID = 1L;
}
