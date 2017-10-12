package ThomasVanausloos.WhatToEatDillemaSolver.login.service;

import ThomasVanausloos.WhatToEatDillemaSolver.AbstractIntegrationTest;
import ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User;
import ThomasVanausloos.WhatToEatDillemaSolver.login.dto.SessionDTO;
import ThomasVanausloos.WhatToEatDillemaSolver.login.dto.UserDTO;
import ThomasVanausloos.WhatToEatDillemaSolver.login.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

import static ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User.UserBuilder.aUser;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.newArrayList;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class AppUserServiceTest extends AbstractIntegrationTest {

    @Inject
    private UserRepository userRepository;

    @Inject
    private AppUserService userService;

    @Test
    public void login_whenLogginInWithCorrectCredentials_returnsCorrectSessionInformationObject(){
        UserDTO loginCredentials = new UserDTO();
        loginCredentials.userName = "Username";
        loginCredentials.password = "Password";
        User user = aUser()
                .withUsername("Username")
                .withPassword("Password")
                .build();

        userRepository.save(user);

        assertThat(userService.login(loginCredentials)).isEqualTo(SessionDTO.anInstance().withRoles(newArrayList("ULTIMATE_USER")).withUserName("Username").build());

    }

}