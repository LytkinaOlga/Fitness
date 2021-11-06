package by.bntu.fitr.lytkina.servise;

import by.bntu.fitr.lytkina.model.Sex;
import by.bntu.fitr.lytkina.model.User;
import org.springframework.stereotype.Service;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class UserService {
    public User create(User user) {
        Calendar currentDate = new GregorianCalendar();
        User newUser = new User(user.getFirstname(),
                user.getLastname(),
                user.getDateOfBirth(),
                user.getEmail(),
                currentDate,
                user.getSex(),
                user.getPhoneNumber());
        return newUser;
    }

    public User getOneUser() {
        Calendar dateOfBirth = new GregorianCalendar(2000, 5, 21);
        Calendar currentDate = new GregorianCalendar();
        return new User("Olya",
                "Lytkina",
                dateOfBirth,
                "ollytkina@icloud.com",
                currentDate,
                Sex.FEMALE,
                "(29)2617300"
        );
    }
}
