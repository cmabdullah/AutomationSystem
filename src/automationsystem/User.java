/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationsystem;

/**
 *
 * @author abdullah
 */
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    
    public  User(int ID, String FirstName, String LastName, int Age){
        this.id = ID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
    }

    User(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getId(){
    return id;
}
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    
}
