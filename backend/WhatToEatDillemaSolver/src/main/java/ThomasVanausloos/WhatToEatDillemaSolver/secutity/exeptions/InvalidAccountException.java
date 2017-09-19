package ThomasVanausloos.WhatToEatDillemaSolver.secutity.exeptions;

public class InvalidAccountException extends RuntimeException {
    public InvalidAccountException(String message) {
        super ( "Invalid account:" + message);
    }
}
