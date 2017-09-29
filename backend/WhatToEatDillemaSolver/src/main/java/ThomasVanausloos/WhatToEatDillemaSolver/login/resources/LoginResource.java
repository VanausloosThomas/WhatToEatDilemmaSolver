package ThomasVanausloos.WhatToEatDillemaSolver.login.resources;

import ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User;
import ThomasVanausloos.WhatToEatDillemaSolver.login.service.AppUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

@Controller
@RequestMapping("/login")
public class LoginResource {

    @Inject
    private AppUserService userService;

    public void login(User loginDetails){
        return userService.login(loginDetails);
    }
}
