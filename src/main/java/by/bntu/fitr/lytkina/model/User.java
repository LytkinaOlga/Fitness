package by.bntu.fitr.lytkina.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Calendar;

@Data
@Entity(name = "user_data")
@NoArgsConstructor
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private int userId;
    private String firstname;
    private String lastname;
    private Calendar dateOfBirth;
    private String email;
    private Calendar registerDate;
    private Sex sex;
    private String phoneNumber;

    public User(String firstname,
                String lastname,
                Calendar dateOfBirth,
                String email,
                Calendar registerDate,
                Sex sex,
                String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.registerDate = registerDate;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
    }
}
