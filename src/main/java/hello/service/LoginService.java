package hello.service;

import hello.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: HJAIN
 * Date: 4/26/15
 * Time: 8:05 PM
 * To change this template use File | Settings | File Templates.
 */
public interface LoginService {
    public boolean verifyLoginRequest(User user);
}
