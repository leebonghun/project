package project.dao;



public class ProjectDAO {
	
	static {
		try {
			Class.forName("oracle.jdbc.oracledriver");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("안녕하세요");

	}
}
