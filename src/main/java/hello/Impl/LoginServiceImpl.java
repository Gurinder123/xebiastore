package hello.Impl;

import hello.dao.LoginDao;
import hello.model.User;
import hello.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: HJAIN
 * Date: 4/26/15
 * Time: 8:07 PM
 * To change this template use File | Settings | File Templates.
 */

@Service("LoginService")
public class LoginServiceImpl  implements LoginService {

    @Autowired
    LoginDao loginDao;

    @Override
    public boolean verifyLoginRequest(User user) {

        String userName = user.getUsername();
        String password = "";
        User admin = loginDao.findByName(userName);

        if(admin != null ){
            password = admin.getPassword();
        }

        if(password != null  &&  user.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
