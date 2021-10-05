package project.dao;



public class ProjectDAO {
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("https://github.com/leebonghun/project.git");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
