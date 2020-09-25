package com.example.demo.service.impl;

import com.example.demo.dao.ConsumerMapper;
import com.example.demo.domain.Consumer;
import com.example.demo.service.ConsumerService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private ConsumerMapper consumerMapper;

    @Override
    public boolean addUser(Consumer consumer) {
        return false;
    }

    @Override
    public boolean updateUserMsg(Consumer consumer) {
        return false;
    }

    @Override
    public boolean updateUserAvator(Consumer consumer) {

        return false;
    }

    @Override
    public boolean existUser(String username) {
        return false;
    }

    @Override
    public boolean veritypasswd(String username, String password) {

        return false;
    }

//    删除用户
    @Override
    public boolean deleteUser(Integer id) {
        return false;
    }

    /**
     * 返回所有用户
     * */
    @Override
    public List<Consumer> allUser() {
        return null;
    }

    @Override
    public List<Consumer> userOfId(Integer id) {

        return null;
    }

    @Override
    public List<Consumer> loginStatus(String username) {

        return null;
    }
}
