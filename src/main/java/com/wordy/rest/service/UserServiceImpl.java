package com.wordy.rest.service;

import com.wordy.rest.dao.UserDAO;
import com.wordy.rest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Override
    @Transactional
    public List<User> getAllUsers(int page, int count) {
        return userDAO.getAllUsers(page, count);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }


    @Override
    @Transactional
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    @Transactional
    public long usersCount() {
        return userDAO.usersCount();
    }
}
