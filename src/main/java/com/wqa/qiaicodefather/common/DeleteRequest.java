package com.wqa.qiaicodefather.common;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @BelongsProject: qi-ai-code-father
 * @BelongsPackage: com.wqa.qiaicodefather.common
 * @Author: wuqian
 * @CreateTime: 2025-08-14 22:37
 * @Description: 删除请求
 * @Version: 1.0
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    @Serial
    private static final long serialVersionUID = 1L;
}
