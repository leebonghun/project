package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProjectDAO {
	
	static {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.oracledriver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		System.out.println("안녕하세요");

	}
	public void temp() {
		System.out.println("안녕하세요~");
	}
}


