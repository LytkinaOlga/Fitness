package by.bntu.fitr.lytkina.dto;

import by.bntu.fitr.lytkina.model.Sex;
import lombok.Data;

import java.util.Calendar;

@Data
public class UserDTO {
    private String firstname;
    private String lastname;
    private Calendar dateOfBirth;
    private String email;
    private Sex sex;
    private String phoneNumber;
}
