package com.vhukze.masterkey.entity;

import lombok.Getter;

/**
 * 异常枚举
 *
 * @author vhukze
 * @date 2023/3/8 - 12:30
 */
@Getter
public enum ExEnum {

    E01("E01", "未获取到加密方式"),
    E02("E02", "未获取到解密秘钥"),
    E03("E03", "不支持的加密方式"),
    E04("E04", "不支持的填充方式"),
    E05("E05", "不支持的加密模式"),

    END("END", "END");

    private final String code;
    private final String msg;

    ExEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}