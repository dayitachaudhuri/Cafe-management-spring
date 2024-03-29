package com.in.cafe.dao;

import com.in.cafe.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User,Integer> {

    User findByEmail(@Param("email") String email);

}
