package ThomasVanausloos.WhatToEatDillemaSolver.login.dto;

import ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User;

import static ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User.UserBuilder.aUser;

public class UserMapper {
    public UserDTO mapToDto(User userToMap) {
        UserDTO userDTO = new UserDTO();
        userDTO.userName = userToMap.getUserName();
        userDTO.password = userToMap.getPassword();

        return userDTO;
    }

    public User mapToUser(UserDTO userDTO) {
        return aUser()
                .withUsername(userDTO.userName)
                .withPassword(userDTO.password)
                .build();
    }
}
