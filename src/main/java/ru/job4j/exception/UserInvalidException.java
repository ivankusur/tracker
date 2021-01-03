package ru.job4j.exception;

public class UserInvalidException extends UserNotFoundException {

    public UserInvalidException(String message) {
        super(message);
    }
}
