package com.ycart.user_service.controller;

import com.ycart.user_service.entity.User;
import com.ycart.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/health")
    public String health() {
        return "User Service Running";
    }

    @Autowired
    private UserService userService;

   @PostMapping("/save")
    public User save(User user) {
        return userService.save(user);
    }

    @PostMapping("/saveAll")
    public void saveAll(List<User> users) {
        userService.saveAll(users);
    }

    @PutMapping("/update")
    public User update(User user) {
        return userService.update(user);
    }

    @PutMapping("/updateAll")
    public void updateAll(List<User> users) {
        userService.updateAll(users);
    }

    @PostMapping("/delete")
    public void delete(User user) {
        userService.delete(user);
    }

    @PostMapping("/deleteAll")
    public void deleteAll(List<User> users) {
        userService.deleteAll(users);
    }

    @GetMapping("/findById")
    public User findId(Long id) {

        return userService.findId(id);
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/findAllByIds")
    public List<User> findAllByIds(List<Long> ids) {
        return userService.findAllByIds(ids);
    }

}
