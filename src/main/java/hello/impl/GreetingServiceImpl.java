package hello.impl;

import hello.service.GreetingService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Saloni
 * Date: 4/24/15
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */

//@Service
public class GreetingServiceImpl implements GreetingService {

    public String getGreeting(String name){
        return "hello "+name;
    }
}
