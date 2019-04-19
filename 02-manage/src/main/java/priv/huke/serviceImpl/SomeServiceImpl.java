package priv.huke.serviceImpl;

import org.springframework.stereotype.Service;
import priv.huke.service.SomeService;

@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("SomeServiceImpl的doSome");
    }
}
