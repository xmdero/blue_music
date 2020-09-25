package com.example.demo.service;

import com.example.demo.domain.Consumer;

import java.util.List;

public interface ConsumerService {

    boolean addUser(Consumer consumer);

    boolean updateUserMsg(Consumer consumer);

    boolean updateUserAvator(Consumer consumer);

    boolean existUser(String username);

    boolean veritypasswd(String username, String password);

    boolean deleteUser(Integer id);

    /**
     * 返回所有用户
     * */
    List<Consumer> allUser();

    List<Consumer> userOfId(Integer id);

    List<Consumer> loginStatus(String username);

}
