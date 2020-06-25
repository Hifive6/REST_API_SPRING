package com.win.restexamplehw.exceptions;

public class EmployeeNotFoundException extends RuntimeException{
    
    
    private static final long serialVersionUID = 1L;

    public EmployeeNotFoundException(Long id) {
        super("Cound not find employee " + id);
    }
}