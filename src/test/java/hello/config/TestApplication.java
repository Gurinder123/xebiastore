package hello.config;

import hello.service.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: Saloni
 * Date: 4/24/15
 * Time: 5:08 PM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@ComponentScan(value = "hello")
public class TestApplication {

    @Bean
    public GreetingService getMockGreetingService(){
        return new GreetingService() {
            @Override
            public String getGreeting(String name) {
                return "mock";
            }
        };
    }

}
