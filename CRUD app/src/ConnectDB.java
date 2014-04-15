import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/UserDB";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "bimba";
		try{
			Class.forName(driver).newInstance();
			Connection connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connect");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
