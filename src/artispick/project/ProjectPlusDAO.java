package artispick.project;

import java.sql.Connection;
import java.util.Date;

import artispick.adminDatail.AdminDetailVO;
import artispick.mypage.MypageVO;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ProjectPlusDAO {
	private Connection conn;

	/**1,2동작은 재사용하기 위해서 생성자 구현*/
	public ProjectPlusDAO(){
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
	
	
	/** 프로젝트 추가  */
	public boolean insertProject(String pj_name, String image, int target, int total_price, 
			String pj_story, String refund, String bank, String account_name, int account, 
			String id, int field_num){
		boolean result = false;
		try {
			String sql = "insert into project(pj_name, image, upload_date, target, total_price, deadline, "
					+ "sche_date, pj_story, refund, bank, account_name, account, id, field_num) "
					+ "values(?, ?, now(), ?, ?, date_add(now(),interval 1 month), date_add(now(),interval 2 month), ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pj_name);
			pstmt.setString(2, image);
			pstmt.setInt(3, target);
			pstmt.setInt(4, total_price);
//			pstmt.setDate(5, new java.sql.Date(deadline.getTime()));
//			pstmt.setDate(6, new java.sql.Date(sche_date.getTime()));
			pstmt.setString(5, pj_story);
			pstmt.setString(6, refund);
			pstmt.setString(7, bank);
			pstmt.setString(8, account_name); 
			pstmt.setInt(9, account);
			pstmt.setString(10, id);
			pstmt.setInt(11, field_num);
			
			if(pstmt.executeUpdate() == 1)
				result=true;

		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	/** 아이디 검색  */
	public ProjectPlusVO selectId(String id){
		ProjectPlusVO vo = null;
		String sql = "select pj_num "
				+ "from project "
				+ "where id = ? order by pj_num desc limit 1";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new ProjectPlusVO();
				vo.setPj_num(rs.getInt("pj_num"));
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vo;
	}
	

	/** 프로젝트 후원품 추가  */
	public boolean insertProject2(String goods_price, String goods_name, String store, int pj_num){
		boolean result = false;
		try {
			
			String sql = "insert into pj_goods(goods_price, goods_name, store, pj_num) "
					+ "values(?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, goods_price);
			pstmt.setString(2, goods_name);
			pstmt.setString(3, store);
			pstmt.setInt(4, pj_num);
		
			
			if(pstmt.executeUpdate() == 1)
				result=true;

		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	/** 총 후원금액 업데이트 ㄴㄴ */
	public boolean updateProjectTotal() {
		boolean result = false;
		PreparedStatement pstmt;
		try{
			String sql = "update project a inner join total_spon_propjgoods b on a.pj_name = b.pj_name set total_price = totals;";
			pstmt = conn.prepareStatement(sql);
			if(pstmt.executeUpdate() == 1){
				result = true;
			}pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	
//	public String selectId(String id){
//	String num = "";
//	String sql = "select pj_num "
//			+ "from project "
//			+ "where id = ? ";
//	try {
//		
//		PreparedStatement pstmt = conn.prepareStatement(sql);
//		pstmt.setString(1, id);
//		ResultSet rs = pstmt.executeQuery();
//		
//		if(rs.next())
//			num = rs.getString("pj_num");
//			
//
//	}catch(SQLException e){
//		e.printStackTrace();
//	}
//	return num;
//}
	
}