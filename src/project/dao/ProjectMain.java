package project.dao;

import java.util.List;
import java.util.Scanner;

public class ProjectMain {

	public static void main(String[] args) {
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		ProjectDAO pdao = new ProjectDAO();
		while (run) {
			System.out.println("*******************");
			System.out.println("1. 전체 부서 조회");
			System.out.println("2. 특정 부서 조회");
			System.out.println("3. 부서 추가");
			System.out.println("4. 부서 수정");
			System.out.println("5. 부서 삭제");
			System.out.println("6. 종료");
			System.out.println("*******************");
			
			System.out.println("선택 >>");
			int menu = sc.nextInt();
			
			
			switch (menu) {
			case 1:
					List<ProjectDTO> list = dao.getrows();
					
				break;

			default:
				break;
			}
			
		}
	}

}
