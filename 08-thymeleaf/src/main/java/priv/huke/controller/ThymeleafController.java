package priv.huke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
    @RequestMapping("index")
    public String indexHandle(Model model) {
        model.addAttribute("welcome", "Hello Thymeleaf");
        return "index";
    }
}
