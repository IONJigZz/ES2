package com.es2.decorator;

import java.io.IOException;

public interface AuthInterface {
    public void auth(String username, String password) throws AuthException, IOException;
}
