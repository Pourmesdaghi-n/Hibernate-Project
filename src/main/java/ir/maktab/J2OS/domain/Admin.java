package ir.maktab.J2OS.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Admin extends User {
    public static final String IS_SUPER_ADMIN = "is_super_admin";

    @Column(name = IS_SUPER_ADMIN)
    private Boolean isSuperAdmin;
}
