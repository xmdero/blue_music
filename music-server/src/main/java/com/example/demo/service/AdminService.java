package com.example.demo.service;

import org.apache.ibatis.annotations.Param;

public interface AdminService {

    boolean veritypasswd(@Param("username") String name,@Param("password") String password);
}
