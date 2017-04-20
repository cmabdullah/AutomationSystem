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


public class User1 {

    private String an;
    private int id;
    
    public  User1(String Answare, int ID){

        this.an = Answare;
        this.id = ID;
    }

    User1(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAnsware(){
        return an;
    }
    public int getId(){
        return id;
    }
    
}