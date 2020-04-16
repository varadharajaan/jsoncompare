package com.jsoncompare.jsoncompare.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Author Varadharajan
 * @Projectname employee-management
 */

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IntegerPraserException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 6601130339967844171L;

    public IntegerPraserException() {
        super();
    }

    public IntegerPraserException(String message) {
        super(message);
    }

}
