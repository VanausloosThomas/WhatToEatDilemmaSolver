//package ThomasVanausloos.WhatToEatDillemaSolver.login.domain;
//
//public class Builder<T> {
//
//    private Class<T> instance;
//    private boolean isAlreadyBuilt = false;
//
//    public Builder(Class<T> instance){
//        try {
//            this.instance = instance.newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public User.UserBuilder withUsername(String username){
//        instance.userName = username;
//        return this;
//    }
//
//    public User.UserBuilder withPassword(String password){
//        instance.password = password;
//        return this;
//    }
//
//    public User build(){
//        if(!isAlreadyBuilt){
//            isAlreadyBuilt = true;
//            return instance;
//        } else {
//            throw new EntityAlreadyBuiltException("Instance was already built");
//        }
//    }
//
//}
