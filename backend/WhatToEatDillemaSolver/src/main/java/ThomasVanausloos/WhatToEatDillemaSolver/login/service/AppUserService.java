package ThomasVanausloos.WhatToEatDillemaSolver.login.service;

import ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User;
import ThomasVanausloos.WhatToEatDillemaSolver.login.dto.SessionDTO;
import ThomasVanausloos.WhatToEatDillemaSolver.login.dto.UserDTO;
import ThomasVanausloos.WhatToEatDillemaSolver.login.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class AppUserService {

    @Inject
    private UserRepository userRepository;

    public SessionDTO login(UserDTO loginDetails) {
        //validate userinfo
        //check if combination of user and password are in the database
//        List<User> results = userRepository.findByUsername(loginDetails.getUserName());

        return SessionDTO.anInstance();
    }
}
