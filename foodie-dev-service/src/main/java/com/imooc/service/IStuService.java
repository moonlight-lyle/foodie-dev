package com.imooc.service;

import com.imooc.pojo.Stu;

public interface IStuService {

    Stu getStuInfo(int id);

    void saveStu();

    void update(int id);

    void deleteStu(int id);
}
