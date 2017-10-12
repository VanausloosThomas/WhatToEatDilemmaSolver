package ThomasVanausloos.WhatToEatDillemaSolver.login.resources;

import ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User;
import ThomasVanausloos.WhatToEatDillemaSolver.login.dto.SessionDTO;
import ThomasVanausloos.WhatToEatDillemaSolver.login.dto.UserDTO;
import ThomasVanausloos.WhatToEatDillemaSolver.login.service.AppUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

@Controller
@RequestMapping("/login")
public class LoginResource {

    @Inject
    private AppUserService userService;

    @PutMapping()
    public SessionDTO login(UserDTO loginDetails){

        return userService.login(loginDetails);
    }
}
