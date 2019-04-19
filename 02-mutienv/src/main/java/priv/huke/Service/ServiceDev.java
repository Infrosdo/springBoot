package priv.huke.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class ServiceDev implements ChooseEnv {
    @Override
    public String send() {
        return "dev";
    }
}
