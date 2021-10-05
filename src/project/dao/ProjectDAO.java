package project.dao;



public class ProjectDAO {
	
	static {
		try {
			Class.forName("oracle.jdbc.oracledriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}
