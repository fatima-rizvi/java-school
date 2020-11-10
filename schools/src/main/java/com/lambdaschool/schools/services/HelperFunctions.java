package com.lambdaschool.schools.services;

import com.lambdaschool.schools.models.ValidationError;

import java.util.List;

public interface HelperFunctions {
    //Note, when you first make this file, the ValidationError model
    // probably hasn't been created yet. Don't freak.
    List<ValidationError> getConstraintViolations(Throwable cause);
}
