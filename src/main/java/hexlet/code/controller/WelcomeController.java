package hexlet.code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/welcome")
public class WelcomeController {

    @GetMapping()
    public String welcome() {
        return "Welcome to Spring";
    }

}
