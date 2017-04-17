/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationsystem;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author abdullah
 */
public class Connect {
    static boolean check(String a, String b){
        try{  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/AutomationSystem", "root", "");  
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from log where username='"+a+"'");  
            if(rs.next()){
                if(rs.getString(2).compareTo(b)==0){
                    JOptionPane.showMessageDialog(null, "Login Successfull");
                    return true;
                }   
                else
                    JOptionPane.showMessageDialog(null, "Login Failed");
            }
            else
                JOptionPane.showMessageDialog(null, "Username or password does not match");
            con.close();  
        }
        catch(Exception e){ 
            System.out.println(e);
        }
        return false;
    }
    
}
