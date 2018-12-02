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
public class EventDAO {
    public boolean save(Event obj){
        boolean flag=true;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usertest?useSSL=false","root","admin");
            PreparedStatement psmt=con.prepareStatement("insert into eventstest values(?,?,?,?,?,?,?,?,?,?);");
            psmt.setString(1, obj.getName());
            psmt.setString(2, obj.getEmail());
            psmt.setString(3, obj.getEvent_name());
            psmt.setString(4, obj.getDescription());
            psmt.setString(5, obj.getPlace());
            psmt.setString(6, obj.getDistrict());
            psmt.setString(7, obj.getState());
            psmt.setString(8, obj.getStart_date());
            psmt.setString(9, obj.getEnd_date());
            psmt.setString(10,obj.getDatabaseTableName());
            psmt.executeUpdate();
            con.close();
        }
        catch(Exception e){
            System.out.print(e);
            flag=false;
        }
        return flag;
    }

    boolean makeDatabase(Event obj) {
        boolean flag=true;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usertestevents?useSSL=false","root","admin");
            String databaseTableName=obj.getDatabaseTableName();
            databaseTableName=databaseTableName.replaceAll("@","AT");
            databaseTableName=databaseTableName.replace(".","DOT");
            
            PreparedStatement psmt=con.prepareStatement("create table "+databaseTableName+"(name varchar(30),email varchar(30));");
            psmt.executeUpdate();
            con.close();
        }
        catch(Exception e){
            System.out.print(e);
            flag=false;
        }
        return flag;
    }
}
