package com.ycart.user_service.repository;

import com.ycart.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userRepositor")
public interface UserRepository extends JpaRepository<User, Long> {
/* This All are the pre-defined methods, no need to

    User save(User user);
    void saveAll(List<User> users);
    Long update(User user);
    void updateAll(List<User> users);
    void delete(User user);
    void deleteAll(List<User> users);
    User findId(Long id);
    List<User> findAllByIds(List<Long> ids)


 */
}
