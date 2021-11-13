package by.bntu.fitr.lytkina.controller;

import by.bntu.fitr.lytkina.dto.UserDTO;
import by.bntu.fitr.lytkina.model.User;
import by.bntu.fitr.lytkina.servise.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    public User create(@RequestBody UserDTO userDTO) {
        return userService.create(userDTO);
    }

}
