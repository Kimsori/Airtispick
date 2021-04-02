package artispick.adminDatail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import artispick.project.ProjectVO;

public class AdminDetailDAO {
	private Connection conn;
	
	public AdminDetailDAO(){
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
	}
	
	
	/**공지사항*/
	public AdminDetailVO getDetailNotice(int noticeNum){
		AdminDetailVO vo = null;
		String sql = "select * from notice "
				+ "where notice_num=?";
		try{
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, noticeNum);
			ResultSet rs=pstmt.executeQuery();			
			//구현
			if(rs.next()) {
				vo = new AdminDetailVO();
				vo.setNoticeNum(rs.getInt("notice_num"));
				vo.setTitle(rs.getString("title"));
				vo.setNoticeDate(rs.getDate("notice_date"));
				vo.setView(rs.getInt("view"));
				vo.setAdminId(rs.getString("admin_id"));
				vo.setContent(rs.getString("content"));
	
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vo; 
	}
	
	/** 공지사항 조회수 */
	public boolean updateView(int noticeNum){
		boolean result = false;
		
		String sql = "update notice set view=view+1 "
				+ "where notice_num=?";
		try{
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, noticeNum);
					
			if(pstmt.executeUpdate() == 1)
				result = true;
			
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
		
	}

	
}


	


