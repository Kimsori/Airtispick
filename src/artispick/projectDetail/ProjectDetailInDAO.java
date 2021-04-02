package artispick.projectDetail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import artispick.project.ProjectVO;

public class ProjectDetailInDAO {
	private Connection conn;
	
	public ProjectDetailInDAO(){
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
	
	/**프로젝트 후원품 목록*/
	public ArrayList<ProjectDetailInVO> getDetailProjectIn(int pjNum){
		ArrayList<ProjectDetailInVO> list = new ArrayList();
		
		try{
			String sql = "select project.pj_num as pj_num, project.pj_name as pj_name, "
					+ "pj_goods.pj_goods_num as pj_goods_num, "
					+ "pj_goods.goods_price as goods_price, pj_goods.goods_name as goods_name, "
					+ "pj_goods.store as store, pj_goods.spon_count from project, pj_goods "
					+ "where pj_goods.pj_num = project.pj_num and project.pj_num = ?";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, pjNum);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
				list.add(new ProjectDetailInVO(rs.getInt(1), rs.getString(2), 
						rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7)));
			rs.close();
			pstmt.close();

		} catch(SQLException e) {
			e.printStackTrace();
		}
		return list; 
	}
	
	public ArrayList<ProjectDetailInVO> getDetailProjectInn(int pjNum, int pj_goods_num){
		ArrayList<ProjectDetailInVO> list = new ArrayList();
		
		try{
			String sql = "select project.pj_num as pj_num, project.pj_name as pj_name, "
					+ "pj_goods.pj_goods_num as pj_goods_num, "
					+ "pj_goods.goods_price as goods_price, pj_goods.goods_name as goods_name, "
					+ "pj_goods.store as store from project, pj_goods "
					+ "where pj_goods.pj_num = project.pj_num and "
					+ "project.pj_num = ? and pj_goods.pj_goods_num = ?";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, pjNum);
			pstmt.setInt(2, pj_goods_num);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
				list.add(new ProjectDetailInVO(rs.getInt(1), rs.getString(2), 
						rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getInt(6)));
			rs.close();
			pstmt.close();

		} catch(SQLException e) {
			e.printStackTrace();
		}
		return list; 
	}
	
	/**후원품 구매한 후원자수 update*/
	public boolean updateProjectSpon() {
		boolean result = false;
		PreparedStatement pstmt;
		try{
			String sql = "update pj_goods a inner join goodsList b "
					+ "on a.pj_goods_num = b.pj_goods_num "
					+ "set spon_count = spon_con";
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
