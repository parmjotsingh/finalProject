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
public class EventInsert {
    public boolean insert(String name, String email, String event_name, String description, String place, String district, String state, String start_date, String end_date ,String databaseTableName){
        Event obj=new Event(name,email,event_name,description,place,district,state,start_date,end_date,databaseTableName);
        
        EventDAO ob=new EventDAO();
        if(ob.save(obj)){
            return ob.makeDatabase(obj);
        }
        else{
            return false;
        }
    }
}
