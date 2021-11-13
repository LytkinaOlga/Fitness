package by.bntu.fitr.lytkina.servise;

import by.bntu.fitr.lytkina.dto.UserDTO;
import by.bntu.fitr.lytkina.exceptions.UserWasNotCreatedException;
import by.bntu.fitr.lytkina.model.User;
import by.bntu.fitr.lytkina.repo.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class UserService {
    private final UserRepository userRepository;

    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(UserDTO userDTO
    ) {
        try {
            Calendar currentDate = new GregorianCalendar();
            User newUser = new User(userDTO.getFirstname(),
                    userDTO.getLastname(),
                    userDTO.getDateOfBirth(),
                    userDTO.getEmail(),
                    currentDate,
                    userDTO.getSex(),
                    userDTO.getPhoneNumber());
            userRepository.save(newUser);
            logger.info("New USER is created: name - {}, register date - {}", newUser.getFirstname() + " " + newUser.getLastname(), currentDate.getTime());
            return newUser;
        } catch (Exception e){
            logger.error(e.getMessage());
            throw new UserWasNotCreatedException(userDTO.getFirstname() + userDTO.getLastname());
        }
    }
}
