package org.sopt.homesool.exception.model;

import org.sopt.homesool.common.dto.Error;

public class ConflictException extends SoptException {
    public ConflictException(Error error, String message) {
        super(error, message);
    }
}