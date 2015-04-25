package hello.dao;

import hello.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by gurinder on 26/4/15.
 */
@Transactional
public interface LoginDao extends CrudRepository<User, Long> {

    public User findByName(String name);
}
