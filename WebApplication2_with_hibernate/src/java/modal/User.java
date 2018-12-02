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
public class User {
    private int Contact;
    private String Name,Email,Password;
    User()
    {
        
    }
    public User(String Email, String Password)
    {
        this.Email = Email;
        this.Password = Password;
    }
    public int getContact() {
        return Contact;
    }

    public void setContact(int Contact) {
        this.Contact = Contact;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "User{" + "Contact=" + Contact + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password + '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals() called.");
        User ob=(User)o;
        if(Email.equals(ob.getEmail()) && Password.equals(ob.getPassword())){
            return true;
        }
        else{
            return false;
                    }
    }
    
}
