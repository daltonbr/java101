package com.company;
/**
 * Created on 5/6/16 by:
 * Dalton Lima         github.com/daltonbr
 * Lucas Pinheiro      github.com/lucaspin
 */
public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super(message);
    }

    public DivisionByZeroException() {
        super("Division by Zero");
    }
}
