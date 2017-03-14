
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Manager {
	
	 Connection myConn;
	 int personCount;

	public Manager() throws Exception {
		String user = "root";
		String passWord = "";
		String url = "jdbc:mysql://localhost:3306/db-test";
		
		//object to connect to database
		 myConn = DriverManager.getConnection(url, user, passWord);
		
		System.out.println("DB connection successful to: " + url);
	}
	
	public List<Person> getAllperson() throws Exception {
		
		List<Person> list = new ArrayList<>();
		
		Statement sqlState = null;
		ResultSet rows = null; 
		
		try{
				sqlState = myConn.createStatement();
				rows = sqlState.executeQuery("Select * from People");
				while(rows.next())
				{
					Person tempPerson = createPerson(rows);
					list.add(tempPerson);
					//System.out.println(tempPerson.getfirstName());
					personCount++;
				}
				return list;
			}
		finally{
			close(sqlState, rows);
		}
	}
	
	public void addPerson(Person b) throws Exception
	{
		Statement sqlState = null;
		ResultSet rows = null;
		
		
		String fname = b.getfirstName();
		String lname = b.getlastName();
		String email = b.getEmail();
	
		
		
		try{
				sqlState = myConn.createStatement();
				String sql = "insert into People"
						+ "( first_name, last_name, email)"
						+  "values ( '"+fname+"' ,'"+lname+"','"+ email+"')";
				
				//sqlState.executeUpdate(sql);
				
				//System.out.println(b.getfirstName() + " Was added to the DataBase!");
				
			}
		finally{
			close(sqlState, rows);
		}
		
		
	}
	
	
	
	/**
	 * 
	 * @param rows
	 * @return an person Object 
	 * @throws Exception
	 */
	private Person createPerson(ResultSet rows) throws Exception
	{
		
		int id = rows.getInt("id");
		String lastName = rows.getString("last_name");
		String firstName = rows.getString("first_name");
		String email = rows.getString("email");
		
		Person person = new Person(id, firstName, lastName, email);
	
		return person;
	}
	
	private int getPersonCount()
	{
		return personCount;
	}
	
	private static void close(Connection myConn, Statement myStmt, ResultSet myRs)
			throws SQLException {

		if (myRs != null) {
			myRs.close();
		}

		if (myStmt != null) {
			
		}
		
		if (myConn != null) {
			myConn.close();
		}
	}
	
	private void close(Statement myStmt, ResultSet myRs) throws SQLException {
		close(null, myStmt, myRs);		
	}
	
	public static void main(String[] args) throws Exception {
		Manager a = new Manager();
		a.getAllperson();
		System.out.println("Total person count " + a.getPersonCount());
		;
	}
	


}
