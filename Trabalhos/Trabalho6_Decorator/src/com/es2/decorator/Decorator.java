package com.es2.decorator;

import java.io.IOException;

public class Decorator extends Object implements AuthInterface{

    AuthInterface ai;
    public Decorator(AuthInterface auth){
        this.ai = auth;
    }
    public void auth(String username, String password) throws AuthException, IOException {
        this.ai.auth(username, password);
    }
}
