package priv.huke.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class ServiceTest implements ChooseEnv {
    @Override
    public String send() {
        return "test";
    }
}
