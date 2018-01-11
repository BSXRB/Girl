package com.llc.girl.controller;

import com.llc.girl.protperties.Girlpropertis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello",method = RequestMethod.GET)
public class HelloController {
    @Autowired
    private Girlpropertis girlpropertis;
    @RequestMapping(value = "/say" ,method= RequestMethod.GET)
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
      return "id:"+id;
    }
}
