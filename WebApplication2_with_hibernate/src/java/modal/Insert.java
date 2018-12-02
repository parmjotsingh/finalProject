/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

/**
 *
 * @author Parmjot Singh chahal
 */
public class Insert {
    public boolean insert(String name,String email,String password,int contact){
        User obj=new User();
        obj.setName(name);
        obj.setEmail(email);
        obj.setPassword(password);
        obj.setContact(contact);
        
        UserDao ob=new UserDao();
        return ob.save(obj);
    }
}
