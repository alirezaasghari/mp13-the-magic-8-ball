package at.refugeescode.mp13themagic8ball.controller;

import at.refugeescode.mp13themagic8ball.logic.Magic8Ball;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ApplicationController {

    private Magic8Ball magic8Ball;

    public ApplicationController(Magic8Ball magic8Ball) {
        this.magic8Ball = magic8Ball;
    }

    @ModelAttribute("message")
    String message() {
        return magic8Ball.getRandomMessage();
    }

    @GetMapping
    String page() {
        return "home";
    }
}
