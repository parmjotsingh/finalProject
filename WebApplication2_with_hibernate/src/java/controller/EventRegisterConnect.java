/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modal.EventRegisterDAO;

/**
 *
 * @author Parmjot Singh chahal
 */
public class EventRegisterConnect {
    public boolean connect(String databaseTableName,String name,String email){
        //System.out.println(databaseTableName+name+email);
        EventRegister obj=new EventRegister(databaseTableName, name, email);
        EventRegisterDAO ob=new EventRegisterDAO();
        return ob.save(obj);
    }
}
