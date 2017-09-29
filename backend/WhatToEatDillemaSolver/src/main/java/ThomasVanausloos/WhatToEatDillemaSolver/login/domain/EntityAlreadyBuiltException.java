package ThomasVanausloos.WhatToEatDillemaSolver.login.domain;

public class EntityAlreadyBuiltException extends RuntimeException {

    public EntityAlreadyBuiltException() {
        super("Instance was already built");
    }
}
