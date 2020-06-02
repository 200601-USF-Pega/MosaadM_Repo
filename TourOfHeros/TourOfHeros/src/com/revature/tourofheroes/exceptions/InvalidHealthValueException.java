package com.revature.tourofheroes.exceptions;

public class InvalidHealthValueException extends Exception {

    public InvalidHealthValueException(String msg) {
        System.out.println("Invalid health value inputted.");
    }

}
