package com.lambdaschool.schools.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super("Exception from application: " + message);
    }

}
