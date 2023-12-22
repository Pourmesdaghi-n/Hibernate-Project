package ir.maktab.J2OS.service.impl;

import ir.maktab.J2OS.domain.User;
import ir.maktab.J2OS.service.AuthenticationProvider;
import ir.maktab.J2OS.service.UserService;
import ir.maktab.J2OS.util.SecurityContext;

public class AuthenticationProviderImpl implements AuthenticationProvider {
    private final UserService userService;

    public AuthenticationProviderImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void authenticate(String username, String password) {
        User user = userService.getUserByUserName(username);
        if (user != null) {
            if (password.equals(user.getPassword())) {
                SecurityContext.setCurrentUser(user);
            } else {
                throw new RuntimeException("wrong password!!!");
            }
        } else {
            throw new RuntimeException("not found!!!");
        }
    }
}
