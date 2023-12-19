package ir.maktab.J2OS.domain;

import ir.maktab.J2OS.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Entity
@Table(name = User.TABLE_NAME)
@Inheritance
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

    @Column(name = User.USER_NAME, unique = true)
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

    public User() {
    }

    public User(String firstName, String lastName, String userName, String password, String userType, String mobileNumber, String email, ZonedDateTime birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUserType() {
        return userType;
    }

    public User setUserType(String userType) {
        this.userType = userType;
        return this;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public User setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public ZonedDateTime getBirthday() {
        return birthday;
    }

    public User setBirthday(ZonedDateTime birthday) {
        this.birthday = birthday;
        return this;
    }
}
