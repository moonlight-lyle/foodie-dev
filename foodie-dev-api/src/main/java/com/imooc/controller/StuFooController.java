package com.imooc.controller;

import com.imooc.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuFooController {

    @Autowired
    private IStuService iStuService;

    @Transactional(propagation = Propagation.SUPPORTS)
    @GetMapping("/getStu")
    public Object getStu(Integer id){
        return iStuService.getStuInfo(id);
    }

    @PostMapping("/saveStu")
    public Object saveStu(){
        iStuService.saveStu();
        return "OK";
    }

    @PostMapping("/updateStu")
    public Object updateStu(Integer id){
        iStuService.update(id);
        return "OK";
    }

    @PostMapping("/deleteStu")
    public Object deleteStu(Integer id){
        iStuService.deleteStu(id);
        return "OK";
    }
}
