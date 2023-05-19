package org.sopt.homesool.exception.model;

import org.sopt.homesool.exception.Error;

public class NotFoundException extends SoptException {
    public NotFoundException(Error error, String message) {
        super(error, message);
    }
}