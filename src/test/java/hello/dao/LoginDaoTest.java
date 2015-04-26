package hello.dao;

import hello.Application;
import hello.model.User;
import hello.service.LoginService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by gurinder on 26/4/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class LoginDaoTest {
    @Autowired
    LoginService loginService;
    @Autowired
    LoginDao loginDao;

    @Test
    public void testLoginDaoNotReturnNull() {
        User user = new User("Gurinder", "singh");
        loginService.checkUser(user);
        Assert.assertNotNull((loginDao).findByName("Gurinder"));
    }
}
