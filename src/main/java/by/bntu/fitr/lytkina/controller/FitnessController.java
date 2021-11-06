package by.bntu.fitr.lytkina.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FitnessController {

    @GetMapping
    public String hello() {
        return "Hello world!";
    }
}
