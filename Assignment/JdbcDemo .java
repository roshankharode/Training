package thirdFeb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.ClientDriver");// loading drivers
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Press 1 for View Data");
			System.out.println("Press 2 for update Employee data");
			System.out.println("press 3 for Add  Employee");
			System.out.println("Press 4 for Delete Employee data");
			System.out.println("press 5 for Exit");
			int inp = sc.nextInt();
			if (inp == 5) {
				System.out.println("Bye");
				return;
			}

//---------------------------------------------------------------------------------------------------------------------------------------		

			Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TrainingRoshan;create=true",
					"derby", "derby");
			if (inp == 1) {
				Statement st = conn.createStatement();// execute statement
				ResultSet rs = st.executeQuery("select * from app.employee ");

				while (rs.next()) {
					System.out.println("Employee id     : " + rs.getInt(1));
					System.out.println("Employee Name   : " + rs.getString(2));
					System.out.println("Employee Salary : " + rs.getDouble(3) + "\n");
				}
			}
//------------------------------------------------------------------------------------------------------------------------------------

			if (inp == 3) {
				do {
					System.out.println("Enter id");
					int id = sc.nextInt();
					System.out.println("Enter Name");
					String data = sc.next();
					System.out.println("Enter Salary");
					double sal = sc.nextDouble();
					PreparedStatement ps = conn.prepareStatement("insert into app.employee values(?,?,?)");

					ps.setInt(1, id);
					ps.setString(2, data);
					ps.setDouble(3, sal);
					int i = ps.executeUpdate();
					System.out.println(i + " Record Added Succesfully");
					System.out.println("Do you want to add Another Employee data  Y/N");
					String inpp = sc.next();

					if (inpp.startsWith("N") || inpp.startsWith("n")) {
						System.out.println("Bye");
						break;
					}
				} while (true);
			}

//----------------------------------------------------------------------------------------------	
			
			if (inp == 4) {
				System.out.println("Enter ID to delete Record");
				int rec = sc.nextInt();
				PreparedStatement ps = conn.prepareStatement("delete from app.employee where emp_id=?");
			ps.setInt(1, rec);
			int i =ps.executeUpdate();
			System.out.println(rec+ "Record deleted");
			}
			
//----------------------------------------------------------------------------------------------
			
	if(inp==2) {
		System.out.println("Enter ID");
		int id =sc.nextInt();
		System.out.println("Enter New Name");
		String newName=sc.next();
		PreparedStatement mt=conn.prepareStatement("update app.employee set emp_nm=? where id=?");  
	
		mt.setInt(1,id);
		mt.setString(2, newName);
		int i=mt.executeUpdate();  
		System.out.println(i +" records updated");  
		System.out.println("Data updated Succesfully");
		
	}
		
		
		
		
		}
	}
}
