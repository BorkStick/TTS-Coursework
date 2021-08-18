package tech.tylor.w9d2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MainController {

    @GetMapping("/test")
    public Integer getTest() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}
