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
@Table(name = "user")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   public long id;


    @NotNull
    private String username;

    @NotNull
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
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

    public void setUsername(String username) {
        this.username = username;
    }
}
