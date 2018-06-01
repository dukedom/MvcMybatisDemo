package com.zufang912.service;

import com.zufang912.entity.Userinfo;

import java.util.List;

public interface UserService {

    List<Userinfo> getUsers(Integer userId);
}