/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Parmjot Singh chahal
 */ 
public class UserDao {
    boolean save(User obj){
        boolean flag=true;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usertest?useSSL=false","root","admin");
            PreparedStatement psmt=con.prepareStatement("insert into userTest values(?,?,?,?);");
            psmt.setString(1,obj.getName());
            psmt.setString(2,obj.getEmail());
            psmt.setString(3, obj.getPassword());
            psmt.setInt(4, obj.getContact());
            psmt.executeUpdate();
            con.close();
        }
        catch(Exception e){
            flag=false;
        }
        
        return flag ;
    }
}
