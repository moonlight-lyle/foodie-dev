package com.test;

import com.imooc.Application;
import com.imooc.pojo.Stu;
import com.imooc.service.IStuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) //要使用@Autowired注入类，必须加该注解，否则会报空指针
@SpringBootTest(classes = Application.class)
public class TestDemo {

    @Autowired
    private IStuService iStuService;

    @Test
    public void fun(){
        System.out.println("测试集成Junit");
    }


    @Test
    public void fun02(){
        Stu stu=new Stu();
        stu.setId(1221);
        stu.setAge(27);
        stu.setName("Nam");
        iStuService.update(1221);
    }
}
