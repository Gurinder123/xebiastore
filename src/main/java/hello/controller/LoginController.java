package hello.controller;

import hello.model.User;
import hello.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: HJAIN
 * Date: 4/26/15
 * Time: 8:02 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public ModelAndView greeting(@RequestParam(value = "name", required = true) String username,
                                 @RequestParam(value = "password", required = true) String password){

        User admin = new User(username, password);
        boolean verify = loginService.verifyLoginRequest(admin);

        if(verify){
            return new ModelAndView("successful");
        }
        else{
            return new ModelAndView("login error");
        }
    }






}
