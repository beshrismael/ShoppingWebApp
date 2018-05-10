/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping.MB;

//import javax.inject.Named;
//import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
/**
 *
 * @author beshrji
 */
//@Named(value = "userMB")
@ManagedBean
@SessionScoped
public class UserMB implements Serializable {
    
    private String name;
    private String password;

    /**
     * Creates a new instance of UserMB
     */
    public UserMB() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
