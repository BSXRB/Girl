package com.llc.girl.handle;

import com.llc.girl.domain.Result;
import com.llc.girl.exception.GirlException;
import com.llc.girl.utils.Resultutil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof GirlException){
            GirlException girlException=(GirlException)e;
            return Resultutil.error(e.getMessage(),girlException.getCode());
        }else{
            return Resultutil.error("未知错误",-1);
        }

    }
}
