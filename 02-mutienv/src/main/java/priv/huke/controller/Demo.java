package priv.huke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.huke.Service.ChooseEnv;

@RestController
public class Demo {

    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot 02";
    }

    @Autowired
    private ChooseEnv chooseEnv;

    @RequestMapping("/send")
    public String send(){
        return chooseEnv.send();
    }
}
