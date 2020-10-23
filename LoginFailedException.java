package br.com.globalcode.exception;

import javax.servlet.ServletException;

public class LoginFailedException extends ServletException {

    public LoginFailedException(String message) {
        super(message);
        System.out.println("Uma exception foi criada!");
    }
}
