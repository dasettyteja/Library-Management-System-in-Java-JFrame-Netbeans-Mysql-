package Project;
import java.sql.*;
import java.sql.DriverManager;


/**
*
* @author LAKSHMI NARAYAN
*/
public class ConnectionProvider {
//String pathConnector="com.mysql.cj.jdbc.Driver";
public static Connection getCon()
{

try{
 
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","tejadasetty","tejadasetty@2313");
return con;

}
catch(Exception e)
{ System.out.println(e); 
return null;
}



}


}
