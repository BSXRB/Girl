package com.llc.girl.controller;

import com.llc.girl.domain.Girl;
import com.llc.girl.domain.Result;
import com.llc.girl.repository.GirlRepository;
import com.llc.girl.service.GirlService;
import com.llc.girl.utils.Resultutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GirlController {
    @Autowired
    GirlService girlService=new GirlService();
    @Autowired
    private GirlRepository girlRepository;
    //查询所有女生
    @GetMapping("/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }
    @PostMapping("/girls")
    public Result<Girl> addgirl(@Valid Girl girl, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
/*            result.setCode(1);
            result.setMsg(bindingResult.getFieldError().getDefaultMessage());
            System.out.println(bindingResult.getFieldError().getDefaultMessage());*/
            return Resultutil.error(bindingResult.getFieldError().getDefaultMessage(),1);
        }
        girl.setAge(girl.getAge());
        girl.setCupSize(girl.getCupSize());
/*       result.setCode(0);
       result.setMsg("成功");
       result.setData(girl);*/
       girlRepository.save(girl);
       return Resultutil.success(girl);
    }
    @GetMapping("/girls/{id}")
    public Girl serchGirl(@PathVariable("id")Integer id){
        return girlRepository.findOne(id);
    }
    @PutMapping("/girls/{id}")
    public Girl updateGirl(@PathVariable("id")Integer id,
                           @RequestParam("cupSize")String cupSize,
                           @RequestParam("age")Integer age){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);

    }
    @DeleteMapping("/girls/{id}")
    public void deletGril(@PathVariable("id")Integer id){
        girlRepository.delete(id);
    }
    @GetMapping("/girls/getage/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception{
        girlService.getAge(id);

    }

}
