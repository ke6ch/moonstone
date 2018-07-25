package nickel.moonstone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("hello", "Hello World !");
        return "login";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("hello", "Hello World !");
        return "home";
    }
}