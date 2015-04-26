package hello.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: HJAIN
 * Date: 4/26/15
 * Time: 7:48 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private static long Id;


    @NotNull
    private String username;

    @NotNull
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public  String getUsername() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }




}
