package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProjectDAO {
	
	static {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("Oracle.jdbc.OracleDriver");

			System.out.println("https://github.com/leebonghun/project.git");


		} catch (ClassNotFoundException e) {

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("안녕하세요");
		System.out.println("Hello Java");
		System.out.println("테스트 중 입니다.");
	}
			
}


