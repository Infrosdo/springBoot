package priv.huke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/student")
@Controller
public class StudentController {

    @RequestMapping("/register")
    public String registerHandle(String name, String age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "jsp/welcome";
    }
    @RequestMapping("/test")
    public String test(){
        return "jsp/test";
    }
}
