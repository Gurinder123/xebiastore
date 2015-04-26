package hello.controller;

/**
 * Created by anshulsharma on 24/04/15.
 */

import hello.model.User;
import hello.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    @ResponseBody
    public String greeting(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "password", required = true) String password) {
        User user = new User(name, password);
        boolean checker = loginService.checkUser(user);
        if (checker) {
            return "{success:true}";
        } else {
            return "{success:false}";
        }

    }

}
