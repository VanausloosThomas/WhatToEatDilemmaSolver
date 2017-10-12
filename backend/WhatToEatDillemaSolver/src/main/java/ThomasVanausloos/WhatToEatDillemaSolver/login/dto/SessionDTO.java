package ThomasVanausloos.WhatToEatDillemaSolver.login.dto;


import java.util.ArrayList;
import java.util.List;

public class SessionDTO {

    public String userName;
    public List<String> roles;

    //TODO return cookie/session information


    private SessionDTO() {
        this.userName = "";
        this.roles = new ArrayList();
    }

    public static SessionDTO anInstance(){
        return new SessionDTO();
    }

    public SessionDTO build(){
        if(this.userName != null && this.roles.isEmpty()){
            return this;
        }
        throw new RuntimeException("SessionDTO: username and roles can not be null !!!");
    }
    public SessionDTO withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public SessionDTO withRoles(List<String> roles )  {
        this.roles = roles;
        return this;
    }
}
