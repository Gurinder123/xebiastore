package hello.controller;

import hello.Application;
import hello.dao.LoginDao;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.when;

/**
 * Created by gurinder on 26/4/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class LoginControllerIntergrationTest {
    @Autowired
    LoginDao loginDao;

    @Test
    public void checkValidUser() {
        when().get("/login/?name=Gurinder&password=singh").then().
                body("status", Matchers.is("success"));
    }


    @Test
    public void checkInvalidUser() {
        when().get("/login/?name=master&password=singh").then().
                body("status", Matchers.is("failure"));
    }
}
