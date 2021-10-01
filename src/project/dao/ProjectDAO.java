package project.dao;

public class ProjectDAO {
	
	
	static {
		try {
			Class.forName("Oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
