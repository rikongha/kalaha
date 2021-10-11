package com.rikongha.kalaha.services.exceptions;

import com.rikongha.kalaha.util.exception.KalahException;

public class GameNotFoundException extends KalahException {
    public GameNotFoundException(String message) {
        super(message);
    }
}
