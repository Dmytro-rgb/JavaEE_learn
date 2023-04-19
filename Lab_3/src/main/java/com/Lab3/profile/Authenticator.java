package com.Lab3.profile;

import com.Lab3.models.User;

public interface Authenticator {

    public User authenticateByUserName(String userName, String password);
    public User authenticateByUserEmail(String email, String password);

}
