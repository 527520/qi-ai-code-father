package com.wqa.qiaicodefather.model.dto;

import com.wqa.qiaicodefather.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * @BelongsProject: qi-ai-code-father
 * @BelongsPackage: com.wqa.qiaicodefather.model.dto
 * @Author: wuqian
 * @CreateTime: 2025-08-17 19:47
 * @Description: 用户查询请求参数封装类
 * @Version: 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 简介
     */
    private String userProfile;

    /**
     * 用户角色：user/admin/ban
     */
    private String userRole;

    @Serial
    private static final long serialVersionUID = 1L;
}
