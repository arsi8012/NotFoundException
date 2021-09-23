package ru.netology.domain;

public class NotFoundException extends RuntimeException {
    private String msg;

    public NotFoundException(String msg) {
        super(msg);
    }
}
