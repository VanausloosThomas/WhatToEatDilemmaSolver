package ThomasVanausloos.WhatToEatDillemaSolver.login.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import static ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User.TABLE_NAME;

@Entity
@Table(name = TABLE_NAME)
public class User {

    public static final String TABLE_NAME = "APP_USER";
    public static final String COLUMN_USERNAME = "USERNAME";
    public static final String COLUMN_PASSWORD = "PASSWORD";

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

    public static class UserBuilder{

        private User instance;
        private boolean isAlreadyBuilt = false;

        public static UserBuilder aUser(){
            return new UserBuilder();
        }
        public UserBuilder(){
            instance = new User();
        }

        public UserBuilder withUsername(String username){
            instance.userName = username;
            return this;
        }

        public UserBuilder withPassword(String password){
            instance.password = password;
            return this;
        }

        public User build(){
            if(!isAlreadyBuilt){
                isAlreadyBuilt = true;
                return instance;
            } else {
                throw new EntityAlreadyBuiltException();
            }
        }
    }

}
