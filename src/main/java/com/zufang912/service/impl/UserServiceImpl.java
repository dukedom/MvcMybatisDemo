package com.zufang912.service.impl;

import com.zufang912.dao.mapper.UserinfoMapper;
import com.zufang912.entity.Userinfo;
import com.zufang912.entity.UserinfoExample;
import com.zufang912.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserinfoMapper userinfoMapper;

    public List<Userinfo> getUsers(Integer userId) {
        UserinfoExample example = new UserinfoExample();
        UserinfoExample.Criteria criteria = example.createCriteria();
        if (!"".equals(userId == null ? "" : userId)) {
            criteria.andIdEqualTo(userId);
        }
        return userinfoMapper.selectByExample(example);

    }
}