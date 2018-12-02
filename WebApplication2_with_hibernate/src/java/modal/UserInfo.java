/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Parmjot Singh chahal
 */
public class UserInfo {
    public List info(String email){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userTest?useSSL=false","root","admin");
             PreparedStatement psmt=con.prepareStatement("select * from usertest where email=?");
             psmt.setString(1, email);
             ResultSet rs=psmt.executeQuery();
             ArrayList<String> l=new ArrayList<>();
             while(rs.next()){
                 String contact=rs.getString(4);
                 String name= rs.getString(1);
                 //System.out.print(name);
                 l.add(name);
                 l.add(email);
                 l.add(contact);
                 con.close();
                 return l;
                 
             }
         }
         catch(Exception e){
             System.out.println(e);
            return null; 
         }
        System.out.println("returning null UserInfo");
        return null;
    }
//        List<String> arr = new ArrayList<>();
//        arr.add("vatsal");
//        arr.add("murtaz");
//        arr.add("aaa");
//        return arr;
//    }
}
