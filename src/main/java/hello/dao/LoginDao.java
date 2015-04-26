package hello.dao;

//import org.springframework.transaction.annotation.Transactional;

import hello.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: HJAIN
 * Date: 4/26/15
 * Time: 8:10 PM
 * To change this template use File | Settings | File Templates.
 */

@Transactional
public interface LoginDao extends CrudRepository<User, Long> {

    public User findByName(String name);

}
