package com.llc.girl.enums;

public enum ResultEunm {
    UNKOWN_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRAMARY_SCHOOL(100,"你可能还在上小学"),
    MIDDLE_SCHOOL(101,"你可能在上中学"),
    HIGHT_SCHOOL(102,"你可能在上大学");
    ;
    private Integer code;
    private String msg;

    ResultEunm(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
