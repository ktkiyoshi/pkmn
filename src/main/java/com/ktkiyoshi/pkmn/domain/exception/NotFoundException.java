package com.ktkiyoshi.pkmn.domain.exception;

/**
 * 操作しようとしたリソースが存在しない場合にthrowされるException
 */
@SuppressWarnings("serial")
public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }
}