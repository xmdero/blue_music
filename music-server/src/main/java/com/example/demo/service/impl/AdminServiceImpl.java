package com.example.demo.service.impl;

import com.example.demo.dao.AdminMapper;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 根据用户名和密码查询
     *
     * @param name 用户名
     * @param password 密码
     *
     * @return boolean 是否有数据
     * */
    @Override
    public boolean veritypasswd(String name, String password) {
        return false;
    }

}
