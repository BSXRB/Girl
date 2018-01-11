package com.llc.girl.service;

import com.llc.girl.domain.Girl;
import com.llc.girl.enums.ResultEunm;
import com.llc.girl.exception.GirlException;
import com.llc.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    public void getAge(Integer id) throws Exception{
        Girl girl=girlRepository.findOne(id);
        Integer age=girl.getAge();
        if (age<10){
            throw new GirlException(ResultEunm.PRAMARY_SCHOOL);
           //return "你还在上小学";
        }else if (age>=10&&age<16){
            throw new GirlException(ResultEunm.MIDDLE_SCHOOL);
            //return "你还在上初中";
        }else if(age>=16){
            throw new GirlException(ResultEunm.HIGHT_SCHOOL);
            //return "你已经上大学了";
        }
    }
}

