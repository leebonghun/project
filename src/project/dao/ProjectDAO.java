package project.dao;



public class ProjectDAO {
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Hello Java");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
