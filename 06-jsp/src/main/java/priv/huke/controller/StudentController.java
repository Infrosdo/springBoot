package priv.huke.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import priv.huke.Service.StudentService;
import priv.huke.vo.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService service;

    Logger log = Logger.getLogger(StudentController.class);

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/index")
    public String index(){
        log.info("-------------index");
        return "index";
    }

//    @PostMapping(value = "/register",consumes = "application/json")
    @RequestMapping("/register")
    public String registerHandle(@ModelAttribute Student student, Model model) throws Exception {
        log.info("-------------"+student.toString());
        int result = service.addStudent(student);
        log.info("-------------"+result);
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        return "welcome";
    }

    @RequestMapping("/getStudent")
    public String getStudent(Model model){
        log.info("-------------getStudent");
        String s = service.Sel(1).toString();
        model.addAttribute("s", s);
        return "select";
    }
}
