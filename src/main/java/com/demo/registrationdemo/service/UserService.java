package com.demo.registrationdemo.service;

import com.demo.registrationdemo.dto.UserDto;
import com.demo.registrationdemo.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
