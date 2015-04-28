package hello.Impl;

import hello.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public String getGreeting(String name) {
        return "hello " + name;
    }
}
