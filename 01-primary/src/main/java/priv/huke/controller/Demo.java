package priv.huke.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @RequestMapping("/hello")
    public String Hello(){
        return "hello springboot";
    }
}
