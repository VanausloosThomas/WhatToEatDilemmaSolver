package ThomasVanausloos.WhatToEatDillemaSolver.login.repository;


import ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<User,String> {

        List<User> findAll();

        User findUserById(String userId);
}
