package ThomasVanausloos.WhatToEatDillemaSolver.login.repository;


import ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User;
import org.springframework.data.repository.Repository;

import javax.inject.Named;
import java.util.List;

@Named
public interface UserRepository extends Repository<User,String> {

        List<User> findAll();

        User findUserById(String userId);

        User save(User user);
}
