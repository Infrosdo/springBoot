package priv.huke.serviceImpl;

import org.springframework.stereotype.Service;
import priv.huke.service.SomeService;

@Service
public class OtherServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("OtherServiceImpl的doSome");
    }
}
