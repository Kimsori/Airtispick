package artispick.mypage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;

import artispick.project.ProjectVO;

public class MypageDAO {
	private Connection conn;
	
	public MypageDAO(){
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
	
	
	/**후원한 후원품 보기 4개씩 oo*/
	public ArrayList<MypageVO> getsponsorList(String id) {
		ArrayList<MypageVO> list = new ArrayList();
		
		try {
			String sql = "select users.id, project.pj_num, project.pj_name, pj_goods.pj_goods_num, "
					+ "pj_goods.goods_name, sponsor_order_detail.sponsor_order_detail_num, "
					+ "sponsor_order.status, sponsor_order_detail.order_date, "
					+ "sponsor_order_detail.so_amount*sponsor_order_detail.so_price as 후원금, project.image from project, "
					+ "pj_goods, sponsor_order, sponsor_order_detail, users "
					+ "where project.pj_num = pj_goods.pj_num and "
					+ "pj_goods.pj_goods_num = sponsor_order_detail.pj_goods_num and "
					+ "sponsor_order_detail.sponsor_order_num = sponsor_order.sponsor_order_num and "
					+ "sponsor_order.id = users.id and users.id = ? "
					+ "order by sponsor_order_detail.sponsor_order_detail_num desc limit 0,12";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				list.add(new MypageVO(rs.getString(1), rs.getInt(2), 
						rs.getString(3), rs.getInt(4),
						rs.getString(5), rs.getInt(6),
						rs.getString(7), rs.getDate(8), rs.getInt("후원금"), rs.getString(10)));
			}
			rs.close();
			pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
}
	
	/**후원한 후원품 갯수*/
	public MypageVO getsponsorCount(String id) {
		PreparedStatement pstmt;
		ResultSet rs;
		MypageVO vo = null;
		
		try {
			String sql = "select count(users.id) as count from project, pj_goods, "
					+ "sponsor_order, sponsor_order_detail, users where "
					+ "project.pj_num = pj_goods.pj_num and "
					+ "pj_goods.pj_goods_num = sponsor_order_detail.pj_goods_num and "
					+ "sponsor_order_detail.sponsor_order_num = sponsor_order.sponsor_order_num and "
					+ "sponsor_order.id = users.id and users.id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();

			vo = new MypageVO();
			while(rs.next()){
				vo.setCount(rs.getInt("count"));
			}
			rs.close();
			pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
}
	
	/**후원한 프로젝트 보기 12개씩 oo*/
	public ArrayList<MypageVO> getsponsorListt(String id) {
		ArrayList<MypageVO> list = new ArrayList();
		
		try {
			String sql = "select project.pj_num, project.pj_name, spon_order.spon_order_num, "
					+ "spon_order.spon_price, spon_order.spon_date, users.id, project.image "
					+ "from project, spon_order, users "
					+ "where project.pj_num = spon_order.pj_num and "
					+ "users.id = spon_order.id and users.id = ? "
					+ "order by spon_order_num desc limit 0,12";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				list.add(new MypageVO(rs.getInt(1), rs.getString(2), 
						rs.getInt(3), rs.getInt(4),
						rs.getDate(5), rs.getString(6), rs.getString(7)));
			}
			rs.close();
			pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
}
	
	/**후원한 프로젝트 갯수*/
	public MypageVO getsponsorCountt(String id) {
		PreparedStatement pstmt;
		ResultSet rs;
		MypageVO vo = null;
		
		try {
			String sql = "select count(users.id)  as count "
					+ "from project, spon_order, users "
					+ "where project.pj_num = spon_order.pj_num and "
					+ "users.id = spon_order.id and users.id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();

			vo = new MypageVO();
			while(rs.next()){
				vo.setCount(rs.getInt("count"));
			}
			rs.close();
			pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
}
	
	
	
}
