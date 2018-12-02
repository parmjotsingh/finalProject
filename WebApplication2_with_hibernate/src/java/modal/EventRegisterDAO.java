/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import controller.EventRegister;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Parmjot Singh chahal
 */
public class EventRegisterDAO {
    public boolean save(EventRegister obj){
        boolean flag=true;
        try{
            String databaseTableName=obj.getDatabaseTableName();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usertestevents?useSSL=false","root","admin");
            
            PreparedStatement psmt=con.prepareStatement("insert into "+ databaseTableName +" values(?,?);");
            psmt.setString(1, obj.getName());
            psmt.setString(2, obj.getEmail());
            psmt.executeUpdate();
//            System.out.println(databaseTableName);
            con.close();
        }
        catch(Exception e){
            System.err.print(e);
            flag=false;
        }
        
        return flag ;
    }
}
