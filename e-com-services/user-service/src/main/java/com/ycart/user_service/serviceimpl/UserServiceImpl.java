package com.ycart.user_service.serviceimpl;

import com.ycart.user_service.entity.User;
import com.ycart.user_service.repository.UserRepository;
import com.ycart.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepositor;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public User save(User user) {
        return userRepositor.save(user);
    }

    @Override
    @Transactional
    public void saveAll(List<User> users) {
        userRepositor.saveAll(users);
    }

    @Override
    @Transactional
    public User update(User user) {
        return userRepositor.save(user);
    }

    @Override
    @Transactional
    public void updateAll(List<User> users) {
        userRepositor.saveAllAndFlush(users);
    }

    @Override
    @Transactional
    public void delete(User user) {
        userRepositor.delete(user);
    }

    @Override
    @Transactional
    public void deleteAll(List<User> users) {
        userRepositor.deleteAll(users);
    }

    @Override
    @Transactional
    public User findId(Long id) {
        Optional<User> usr = userRepositor.findById(id);
        return usr.orElse(null);
    }

    @Override
    @Transactional
    public List<User> findAll() {
        return userRepositor.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<User> findAllByIds(List<Long> ids) {
        return userRepositor.findAllById(ids);
    }

}
