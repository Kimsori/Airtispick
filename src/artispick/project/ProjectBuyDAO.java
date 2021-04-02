package artispick.project;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ProjectBuyDAO {
	private Connection conn;

	/**1,2동작은 재사용하기 위해서 생성자 구현*/
	public ProjectBuyDAO(){
		try{
			//1 driver loading
			Class.forName("com.mysql.jdbc.Driver");
			//2 DB연결
			String url="jdbc:mysql://128.134.114.237:3306/db216230102";
			String id="216230102";
			String pw="hyw216230102";
			conn 
			= DriverManager.getConnection(url,  id, pw);
		}catch(Exception e){
			e.printStackTrace(); //혹시 예외가 발생하면 경로를 제공해주는 메소드
		}//catch
	}//생성자
	
	
	
	
	
	/** 프로젝트 구매  */
	public boolean buyProject(String addr, Date perform_date, String status, String name, String id, 
			int so_amount, Date order_date, int so_price, int sponsor_order_num, int pj_goods_num){
		boolean result = false;
		try {
			String sql = "insert into sponsor_order(addr, perform_date, status, name, id) "
					+ "values(?, ?, ?, ?, ?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, addr);
			pstmt.setDate(2, new java.sql.Date(perform_date.getTime()));
			pstmt.setString(3, status);
			pstmt.setString(4, name);
			pstmt.setString(5, id);
			
			
			String sql1 = "insert into sponsor_order_detail(so_amount, order_date, so_price, "
					+ "sponsor_order_num, pj_goods_num) values(?, ?, ?, ?, ?)";
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setInt(1, so_amount);
			pstmt1.setDate(2, new java.sql.Date(order_date.getTime()));
			pstmt1.setInt(3, so_price);
			pstmt1.setInt(4, sponsor_order_num);
			pstmt1.setInt(5, pj_goods_num);
			
			if(pstmt.executeUpdate() == 1 && pstmt1.executeUpdate() == 1)
				result=true;

		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
}