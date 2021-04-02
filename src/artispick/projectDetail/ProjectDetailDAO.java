package artispick.projectDetail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import artispick.project.ProjectVO;

public class ProjectDetailDAO {
	private Connection conn;
	
	public ProjectDetailDAO(){
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
	
	

		
	/** 프로젝트 상세페이지 조회  
	 * @param pJName */
	public ProjectDetailVO getDetailProject(int pjNum){
		PreparedStatement pstmt;
		ResultSet rs;
		ProjectDetailVO vo = null;
		
		
		try{
			String sql = "select project.pj_num as pj_num, project.pj_name as pj_name, field.field_name as field, "
					+ "project.target as target, DATEDIFF(project.deadline,curdate()) as deadline, project.image as image, "
					+ "project.sche_date as sche_date, project.pj_story as pj_story, project.refund as refund, "
					+ "artist.arti_name as arti_name, artist.intro as intro, "
					+ "count(pj_goods.pj_num) as goods_count from project, field, artist, users, "
					+ "pj_goods where field.field_num = users.field_num and users.id = artist.id and "
					+ "artist.id = project.id and project.pj_num = pj_goods.pj_num and project.pj_num=? and "
					+ "pj_goods.pj_num = ? group by pj_name";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pjNum);
			pstmt.setInt(2, pjNum);
			rs = pstmt.executeQuery();		
			vo = new ProjectDetailVO();
			//구현
			while(rs.next()) {
				vo = new ProjectDetailVO();
				vo.setPjNum(rs.getInt("pj_num"));
				vo.setPjName(rs.getString("pj_name"));
				vo.setField(rs.getString("field"));
				vo.setTarget(rs.getInt("target"));
				vo.setDeadline(rs.getInt("deadline"));
				vo.setImage(rs.getString("image"));
				vo.setScheDate(rs.getDate("sche_date"));
				vo.setPjStory(rs.getString("pj_story"));
				vo.setRefund(rs.getString("refund"));
				vo.setArtiName(rs.getString("arti_name"));
				vo.setIntro(rs.getString("intro"));
				vo.setGoodsCount(rs.getString("goods_count"));
			}
			
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vo; 
	}
	
	/** 프로젝트 상세페이지++ 조회  
	 * @param pJName */
	public ProjectDetailVO getDetailProjectPlus(int pjNum){
		PreparedStatement pstmt;
		ResultSet rs;
		ProjectDetailVO vo = null;
		
		
		try{
			String sql = "select project.pj_num as pj_num, project.total_price as total_price, "
					+ "ROUND(project.total_price / project.target * 100) as percent, "
					+ "sum(goodsList.spon_con) as spon_con from project, goodsList where project.pj_num=? and "
					+ "goodsList.pj_num=? group by pj_num";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pjNum);
			pstmt.setInt(2, pjNum);
			rs = pstmt.executeQuery();		
			vo = new ProjectDetailVO();
			//구현
			while(rs.next()) {
				vo = new ProjectDetailVO();
				vo.setPjNum(rs.getInt("pj_num"));
				vo.setTotalPrice(rs.getInt("total_price"));
				vo.setPercent(rs.getInt("percent"));
				vo.setSponCount(rs.getInt("spon_con"));
			}
			
			
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vo; 
	}
	
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

	
	
}
