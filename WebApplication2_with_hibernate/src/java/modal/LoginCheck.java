/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Parmjot Singh chahal
 */
public class LoginCheck {
    public String loginValidate(User u){
        User uu=null;
         try{
             Configuration cf=new Configuration();
             cf.configure("hibercfg/hibernate.cfg.xml");
             SessionFactory sf=cf.buildSessionFactory();
             Session s=sf.openSession();
             System.out.println("u.getEmail() : " + u.getEmail() + " u.getPassword() : " + u.getPassword());
             uu=(User)s.get(User.class, u.getEmail());
             System.out.println("uu.getEmail() : " + uu.getEmail() + " uu.getPassword() : " + uu.getPassword());
         }
         catch(Exception e){
             System.out.println(e);
            return null; 
         }
         System.out.println("u.equals(uu) : "+ u.equals(uu));
         if(u.equals(uu)){
             System.out.println(uu.getName());
            return uu.getName();
         }
         else{
             return null;
         }
    }
}
