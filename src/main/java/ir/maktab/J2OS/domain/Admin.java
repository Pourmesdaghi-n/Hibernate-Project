package ir.maktab.J2OS.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin extends User {
    public static final String IS_SUPER_ADMIN = "is_super_admin";

    @Column(name = IS_SUPER_ADMIN)
    private Boolean isSuperAdmin;
}
