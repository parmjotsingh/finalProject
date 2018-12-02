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

/**
 *
 * @author Parmjot Singh chahal
 */
public class EventListDAO {
    public ResultSet list(){
        ResultSet rs;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usertest?useSSL=false","root","admin");
            PreparedStatement psmt=con.prepareStatement("Select * from eventstest;");
            rs=psmt.executeQuery();
            
            return rs;
        }
        catch(Exception e){
            System.out.print(e);
            return null;
        }
    }
}
