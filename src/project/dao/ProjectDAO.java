package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProjectDAO {
	
<<<<<<< HEAD
=======
	
>>>>>>> branch 'master' of https://github.com/leebonghun/project.git
	static {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
<<<<<<< HEAD
			Class.forName("oracle.jdbc.oracledriver");
			
		} catch (Exception e) {
=======
			Class.forName("Oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
>>>>>>> branch 'master' of https://github.com/leebonghun/project.git
			e.printStackTrace();
		} finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}


		System.out.println("안녕하세요");



	}
	
	

}
