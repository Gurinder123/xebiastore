package hello.service;

import hello.dao.LoginDao;
import hello.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gurinder on 26/4/15.
 */
@Service
public class LoginService {

    @Autowired
    LoginDao loginDao;

    public boolean checkUser(User user) {
        boolean checker = false;
        String name = user.getName();
        String password = loginDao.findByName(name).getPassword();
        if (user.getPassword().equals(password)) {
            checker = true;
            return checker;
        }

        return checker;
    }
}
