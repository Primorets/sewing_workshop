package com.sw.sewing_workshop.exception;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DuplicateEmailException extends RuntimeException {
    public DuplicateEmailException(String message) {
        super(message);
        log.error(message);
    }
}