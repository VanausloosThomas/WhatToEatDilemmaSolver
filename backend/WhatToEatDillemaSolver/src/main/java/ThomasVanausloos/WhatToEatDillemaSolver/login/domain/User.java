package ThomasVanausloos.WhatToEatDillemaSolver.login.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

import static ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User.TABLE_NAME;

@Entity
@Table(name = TABLE_NAME)
public class User implements Serializable {

    public static final String TABLE_NAME = "APP_USER";
    public static final String COLUMN_USERID = "USER_ID";
    public static final String COLUMN_USERNAME = "USERNAME";
    public static final String COLUMN_PASSWORD = "PASSWORD";

    @Column(name = COLUMN_USERID)
    private String userId;

    @Column(name =COLUMN_USERNAME)
    private String userName;

    @Column(name = COLUMN_PASSWORD)
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    private User() {
    }

    public static class UserBuilder extends NestedBuilder<User>{

        public static UserBuilder aUser(){
            return new UserBuilder();
        }

        private UserBuilder(){
        }

        @Override
        public User createInstance() {
            return new User();
        }

        public UserBuilder withUsername(String username){
            instance().userName = username;
            return this;
        }

        public UserBuilder withPassword(String password){
            instance().password = password;
            return this;
        }
    }

}
