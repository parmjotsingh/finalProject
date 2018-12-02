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
import java.sql.ResultSet;

/**
 *
 * @author Parmjot Singh chahal
 */
public class EventUserExist {
     public boolean save(String email,String databaseTableName){
        boolean flag=true;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usertestevents?useSSL=false","root","admin");
            databaseTableName=databaseTableName.replaceAll("@","AT");
            databaseTableName=databaseTableName.replace(".","DOT");
            PreparedStatement psmt=con.prepareStatement("Select * from "+ databaseTableName +" where email=?;");
            psmt.setString(1, email);
            ResultSet rs = psmt.executeQuery();
            if(rs.next()){
                return true;
            }
            else{
                return false;
               }
//            System.out.println(databaseTableName);
            
        }
        catch(Exception e){
            System.err.print(e);
            flag=false;
        }
        
        return flag ;
    }
}
