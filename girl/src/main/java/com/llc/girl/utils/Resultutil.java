package com.llc.girl.utils;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.llc.girl.domain.Result;

public class Resultutil {
    public static Result success(Object object){
        Result result=new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;

    }
    public static Result error(String msg,Integer code){
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
