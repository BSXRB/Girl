package com.llc.girl.exception;

import com.llc.girl.enums.ResultEunm;

public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(ResultEunm resultEunm) {
        super(resultEunm.getMsg());
        this.code = resultEunm.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
