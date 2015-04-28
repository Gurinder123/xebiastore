package hello.dao;

import hello.Impl.LoginService;
import hello.controller.Application;
import hello.model.User;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: HJAIN
 * Date: 4/27/15
 * Time: 4:46 PM
 * To change this template use File | Settings | File Templates.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class LoginDaoTest {

    @Autowired
    LoginService loginService;

    @Autowired
    LoginDao loginDao;

    @Test
    public void testFindByName() throws Exception {
        User userAdmin = new User("harsh","password123");
        loginService.verifyLoginRequest(userAdmin);
        Assert.assertNotNull((loginDao).findByName("harsh"));
    }
}
