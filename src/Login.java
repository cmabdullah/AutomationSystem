import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;

public class Login {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/AutomationSystem","root","");  
		//here AutomationSystem is database name, root is username  
		Statement stmt=(Statement) con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from SystemContent");  
		while(rs.next())  
	System.out.println(rs.getString(1)+"  "+rs.getString(2));  
	con.close();  
	}
	catch(Exception e){
		System.out.println(e);
		}  
	}  
}
