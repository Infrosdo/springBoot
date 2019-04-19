package priv.huke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.huke.Dto.Country;
import priv.huke.Dto.Student;
import priv.huke.Service.ChooseEnv;

import java.util.List;

@RestController
@PropertySource(value = "custom.properties", encoding = "gb2312")
public class Demo {

    @RequestMapping("/hello")
    public String hello() {
        return "hello springboot 02";
    }

    @Autowired
    private ChooseEnv chooseEnv;

    @RequestMapping("/send")
    public String send() {
        return chooseEnv.send();
    }

    @Value("${desc}")
    private String desc;

    @Value("${depart}")
    private String depart;

    @Value("${depare}")
    private String depare;

    @RequestMapping("/name")
    public String getDesc() {
        return desc;
    }

    @RequestMapping("/depart")
    public String getDepart() {
        return depart;
    }

    @RequestMapping("/depare")
    public String getDepare() {
        return depare;
    }

    @Autowired
    private Student student;

    @RequestMapping("/student")
    private Student getStudent(){
        return student;
    }

    @Autowired
    private Country country;

    @RequestMapping("/list")
    private List<String> getList(){
        return country.getCities();
    }
}
