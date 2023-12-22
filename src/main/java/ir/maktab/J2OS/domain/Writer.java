package ir.maktab.J2OS.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.ZonedDateTime;

@Entity
@NoArgsConstructor
public class Writer extends User {

    @Builder
    public Writer(String firstName, String lastName, String userName, String password, String userType, String mobileNumber, String email, ZonedDateTime birthday) {
        super(firstName, lastName, userName, password, userType, mobileNumber, email, birthday);
    }
}
