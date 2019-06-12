package com.nankai.xining.service;

import com.nankai.xining.bean.User;
import com.nankai.xining.bean.UserExample;
import com.nankai.xining.repository.FactoryMapper;
import com.nankai.xining.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-06-12 15:39
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 检验用户名和密码
     * @param user
     * @return
     */
    public boolean checkUserNameAndPwd(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andFacNoEqualTo(user.getFacNo());
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.isEmpty()){
            return false;
        }else {
            if (userList.get(0).getPassword().equals(user.getPassword())){
                return true;
            }else
                return false;
        }
    }
}
