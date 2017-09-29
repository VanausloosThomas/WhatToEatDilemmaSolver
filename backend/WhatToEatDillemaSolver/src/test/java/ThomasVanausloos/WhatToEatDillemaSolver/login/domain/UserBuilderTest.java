package ThomasVanausloos.WhatToEatDillemaSolver.login.domain;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User.UserBuilder.aUser;
import static org.assertj.core.api.Assertions.assertThat;

public class UserBuilderTest {

    private User.UserBuilder userBuilder;

    @Before
    public void setUp() throws Exception {
        userBuilder = aUser();
    }

    @Test
    public void buildingAUser_returnsACorrectUser() {
        //given
        userBuilder.withUsername("Thomas");
        userBuilder.withPassword("Password");

        //when
        User builtUser = userBuilder.build();

        //then
        assertThat(builtUser.getUserName()).isEqualTo("Thomas");
        assertThat(builtUser.getPassword()).isEqualTo("Password");
    }

    @Test
    public void build_whenBuildingAUserForTheSecondTime_ThrowsException() throws Exception {
        //given
        userBuilder.withUsername("Thomas");
        userBuilder.withPassword("Password");
        User builtUser = userBuilder.build();

        //when then
        Assertions.assertThatThrownBy(userBuilder::build)
                .isInstanceOf(EntityAlreadyBuiltException.class)
                .hasMessage("Instance was already built");
    }
}