package by.bntu.fitr.lytkina.controller;

import by.bntu.fitr.lytkina.model.User;
import by.bntu.fitr.lytkina.servise.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    public User create(User user) {
        return userService.create(user);
    }

    @GetMapping("/getOneUser")
    public User getOneUser() {
        return userService.getOneUser();
    }
}
