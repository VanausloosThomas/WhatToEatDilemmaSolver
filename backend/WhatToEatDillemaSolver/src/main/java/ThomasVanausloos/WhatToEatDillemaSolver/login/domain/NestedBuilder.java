package ThomasVanausloos.WhatToEatDillemaSolver.login.domain;

public abstract class NestedBuilder<T> {

    private T instance;
    private boolean isAlreadyBuilt = false;

    public NestedBuilder(){
        this.instance = createInstance();

    }

    public abstract T createInstance();

    public T instance(){
        return instance;
    }

    public T build(){
        if(!isAlreadyBuilt){
            isAlreadyBuilt = true;
            return instance;
        } else {
            throw new EntityAlreadyBuiltException();
        }
    }

}
