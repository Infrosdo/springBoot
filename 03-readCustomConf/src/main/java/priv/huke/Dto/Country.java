package priv.huke.Dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@PropertySource(value = "custom.properties", encoding = "gbk")
@ConfigurationProperties("country")
public class Country {
    private List<String> cities;
}
