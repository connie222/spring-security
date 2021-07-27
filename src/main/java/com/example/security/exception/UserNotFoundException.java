package com.example.security.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String userEmail){
        super(userEmail+" NotFoundException");
    }
}
