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
public class Event {
    private String name,email,event_name,description,place,district,state,start_date,end_date,databaseTableName;

    public Event(String name, String email, String event_name, String description, String place, String district, String state, String start_date, String end_date, String databaseTableName) {
        this.name = name;
        this.email = email;
        this.event_name = event_name;
        this.description = description;
        this.place = place;
        this.district = district;
        this.state = state;
        this.start_date = start_date;
        this.end_date = end_date;
        this.databaseTableName = databaseTableName;
    }

    public String getDatabaseTableName() {
        return databaseTableName;
    }

    public void setDatabaseTableName(String databaseTableName) {
        this.databaseTableName = databaseTableName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getEvent_name() {
        return event_name;
    }

    public String getDescription() {
        return description;
    }

    public String getPlace() {
        return place;
    }

    public String getDistrict() {
        return district;
    }

    public String getState() {
        return state;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }
    
}
