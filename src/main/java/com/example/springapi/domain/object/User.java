package com.example.springapi.domain.object;

import lombok.Builder;
import lombok.Data;

/**
 * ユーザー
 */
@Data
@Builder
public class User {
    /**
     * ユーザーid
     */
    private String id;

    /**
     * ユーザ情報
     */
    private String value;
}
