package ThomasVanausloos.WhatToEatDillemaSolver.login.dto;

import ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User;
import org.junit.Before;
import org.junit.Test;

import static ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User.UserBuilder.aUser;
import static org.assertj.core.api.Assertions.assertThat;

public class UserMapperTest {

    private UserMapper mappper;

    @Before
    public void setUp() throws Exception {
        mappper = new UserMapper();
    }

    @Test
    public void mapToDto_whenMappinToDto_ReturnsTheCorrectDto() throws Exception {
        //given
        User userToMap = aUser()
                .withUsername("username")
                .withPassword("password")
                .build();
        //when
        UserDTO mappedDto = mappper.mapToDto(userToMap);

        //then
        assertThat(mappedDto).isNotNull();
        assertThat(mappedDto.password).isEqualTo("password");
        assertThat(mappedDto.userName).isEqualTo("username");
    }

    @Test
    public void mapToUser_whenMappinToUser_ReturnsTheCorrectUser() throws Exception {
        //given
        UserDTO userDTO = new UserDTO();
        userDTO.userName = "username";
        userDTO.password = "password";

        User expectedUser = aUser()
                .withUsername("username")
                .withPassword("password")
                .build();
        //when
        User resultUser = mappper.mapToUser(userDTO);

        //then
        assertThat(resultUser).isNotNull();
        assertThat(resultUser).isEqualToComparingFieldByFieldRecursively(expectedUser);
    }


}