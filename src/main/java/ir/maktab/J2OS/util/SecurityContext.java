package ir.maktab.J2OS.util;

import ir.maktab.J2OS.domain.User;

public class SecurityContext {
    private static User currentUser;

    private SecurityContext() {

    }

    public static void logout() {
        currentUser = null;
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User user) {
        currentUser = user;
    }
}
