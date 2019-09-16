package com.fred.sboot.exception;

public class UserNotExit extends RuntimeException {
    public UserNotExit() {
        super("用户不能存在");
    }
}
