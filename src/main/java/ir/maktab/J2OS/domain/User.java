package ir.maktab.J2OS.domain;

import ir.maktab.J2OS.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Entity
@Table(name = User.TABLE_NAME)
@Inheritance
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity<Long> {
    public static final String TABLE_NAME = "user_table";
    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String USER_NAME = "user_name";
    public static final String PASSWORD = "password";
    public static final String USER_TYPE = "user_type";
    public static final String MOBILE_NUMBER = "mobile_number";
    public static final String EMAIL = "email";
    public static final String BIRTHDAY = "birthday";

    @Column(name = User.FIRST_NAME)
    private String firstName;

    @Column(name = User.LAST_NAME)
    private String lastName;

    @Column(name = User.USER_NAME)
    private String userName;

    @Column(name = User.PASSWORD)
    private String password;

    @Column(name = User.USER_TYPE)
    private String userType;

    @Column(name = User.MOBILE_NUMBER)
    private String mobileNumber;

    @Column(name = User.EMAIL)
    private String email;

    @Column(name = User.BIRTHDAY)
    private ZonedDateTime birthday;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
