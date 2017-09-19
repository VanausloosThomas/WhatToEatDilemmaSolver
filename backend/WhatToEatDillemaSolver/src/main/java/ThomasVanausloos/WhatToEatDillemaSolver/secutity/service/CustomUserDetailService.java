package ThomasVanausloos.WhatToEatDillemaSolver.secutity.service;

import ThomasVanausloos.WhatToEatDillemaSolver.secutity.exeptions.InvalidAccountException;
import ThomasVanausloos.WhatToEatDillemaSolver.secutity.model.User;
import ThomasVanausloos.WhatToEatDillemaSolver.secutity.resource.RoleResource;
import ThomasVanausloos.WhatToEatDillemaSolver.secutity.resource.UserResource;
import org.springframework.security.authentication.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.inject.Inject;

public class CustomUserDetailService implements UserDetailsService {

    private final AccountStatusUserDetailsChecker DETAILS_CHECKER = new AccountStatusUserDetailsChecker();

    @Inject
    private UserResource userResource;

    @Inject
    private RoleResource roleResource;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User user = userResource.getUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        try {
            DETAILS_CHECKER.check(user);
        } catch (LockedException | DisabledException | AccountExpiredException | CredentialsExpiredException ex) {
            throw new InvalidAccountException(ex.getMessage());
        }
        return user;
    }
}
