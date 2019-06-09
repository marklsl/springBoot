package com.zxd.service;

import com.zxd.bean.User;
import com.zxd.dao.IUserDao;
import com.zxd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zxd
 * @create 2017-03-31 17:03
 **/
@Transactional
@Service
public class UserService {
    @Autowired
    private IUserDao dao;

    @Autowired
    private UserRepository userRepository;

    public User findOne(String id) {
        return userRepository.findOne(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public int modifyAgeById(int age, String id) {
        return userRepository.modifyAgeById(age,id);
    }

    public void delete(String id) {
        userRepository.delete(id);
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
