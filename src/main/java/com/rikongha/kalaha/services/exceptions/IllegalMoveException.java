package com.rikongha.kalaha.services.exceptions;

import com.rikongha.kalaha.util.exception.KalahException;

public class IllegalMoveException extends KalahException {
    public IllegalMoveException(String message) {
        super(message);
    }
}
