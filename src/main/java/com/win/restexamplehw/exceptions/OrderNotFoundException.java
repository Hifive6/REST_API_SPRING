package com.win.restexamplehw.exceptions;

public class OrderNotFoundException extends RuntimeException{
    
    
    private static final long serialVersionUID = 1L;

    public OrderNotFoundException(Long id) {
        super("Cound not find Order " + id);
    }
}