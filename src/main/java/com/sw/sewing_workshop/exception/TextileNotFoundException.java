package com.sw.sewing_workshop.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TextileNotFoundException extends RuntimeException {
    public TextileNotFoundException (String message) {
        super(message);
        log.error(message);
    }
}
