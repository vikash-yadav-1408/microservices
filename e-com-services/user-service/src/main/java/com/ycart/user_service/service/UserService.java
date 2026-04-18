package com.ycart.user_service.service;

import com.ycart.user_service.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);

    void saveAll(List<User> users);
    User update(User user);
    void updateAll(List<User> users);
    void delete(User user);
    void deleteAll(List<User> users);
    User findId(Long id);
    List<User> findAll();
    List<User> findAllByIds(List<Long> ids);

}
