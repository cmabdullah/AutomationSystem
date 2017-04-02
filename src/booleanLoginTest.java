import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class booleanLoginTest {
	static boolean check(String a, String b){
        try{  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/AutomationSystem", "root", "");  
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from SystemContent where username='"+a+"'");  
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
