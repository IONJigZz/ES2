package com.es2.decorator;

public class Auth extends Object implements AuthInterface{
    public Auth(){}
    public void auth(String username, String password) throws AuthException{
        if (username != "admin" || password != "admin") {
            throw new AuthException();
        }
    }
}
