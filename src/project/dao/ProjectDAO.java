package project.dao;



public class ProjectDAO {
<<<<<<< HEAD
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
=======

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
>>>>>>> branch 'master' of https://github.com/leebonghun/project.git
	}
}
