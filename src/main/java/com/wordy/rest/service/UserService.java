package com.wordy.rest.service;

import com.wordy.rest.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers(int page,int count);

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);

    public long usersCount();
}
