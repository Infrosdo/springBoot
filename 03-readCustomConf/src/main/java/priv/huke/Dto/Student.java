package priv.huke.Dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Data
@PropertySource(value = "custom.properties", encoding = "gbk")
@ConfigurationProperties("student")
public class Student {
    private String name;
    private String depart;
    private int age;
}
