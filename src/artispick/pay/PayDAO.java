package artispick.pay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import artispick.mypage.MypageVO;
import artispick.project.ProjectPlusVO;
import artispick.project.ProjectVO;
import artispick.projectDetail.ProjectDetailInVO;

public class PayDAO {
	private Connection conn;

	public PayDAO(){
		try{
			//1 driver loading
			Class.forName("com.mysql.jdbc.Driver");
			//2 DB연결
			String url="jdbc:mysql://128.134.114.237:3306/db216230102";
			String id="216230102";
			String pw="hyw216230102";
			conn = DriverManager.getConnection(url, id, pw);
		}catch(Exception e){
			e.printStackTrace(); //혹시 예외가 발생하면 경로를 제공해주는 메소드
		}//catch
	}//생성자
	

	
	/** 구매할 후원품 검색  */
	public PayVO selectnum(int pj_num, int pj_goods_num){
		ArrayList<PayVO> list = new ArrayList();
		PreparedStatement pstmt;
		ResultSet rs;
		PayVO vo = null;
		
		try {
			String sql = "select pj_goods.pj_goods_num, pj_goods.goods_price,"
					+ "pj_goods.goods_name from project, pj_goods "
					+ "where project.pj_num = pj_goods.pj_num and project.pj_num = ? and "
					+ "pj_goods.pj_goods_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pj_num);
			pstmt.setInt(2, pj_goods_num);
			rs = pstmt.executeQuery();
			
			vo = new PayVO();
			 
			while(rs.next()){
				vo.setPj_goods_num(rs.getInt("pj_goods_num"));
				vo.setGoods_price(rs.getInt("goods_price"));
				vo.setGoods_name(rs.getString("goods_name"));
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vo;
	}
	
	/** 후원품 구매  */
	public boolean insertspongoods(int so_amount, int so_price, int pj_goods_num){
		boolean result = false;
		try {
			
			String sql = "insert into sponsor_order_detail(so_amount, order_date, "
					+ "so_price, pj_goods_num) values(?, now(), ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, so_amount);
			pstmt.setInt(2, so_price);
			pstmt.setInt(3, pj_goods_num);
			
			if(pstmt.executeUpdate() == 1)
				result=true;

		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	/** 구매한 후원품 검색  */
	public PayVO selectspon(int pj_num, int pj_goods_num){
		ArrayList<PayVO> list = new ArrayList();
		PreparedStatement pstmt;
		ResultSet rs;
		PayVO vo = null;
		
		try {
			String sql = "select project.pj_name, sponsor_order_detail.so_price, "
					+ "sponsor_order_detail.so_amount, sponsor_order_detail.sponsor_order_detail_num, "
					+ "project.pj_num, pj_goods.pj_goods_num from project, pj_goods, "
					+ "sponsor_order_detail where project.pj_num = pj_goods.pj_num and "
					+ "pj_goods.pj_goods_num = sponsor_order_detail.pj_goods_num and "
					+ "project.pj_num = ? and pj_goods.pj_goods_num = ? "
					+ "order by sponsor_order_detail_num desc limit 1";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pj_num);
			pstmt.setInt(2, pj_goods_num);
			rs = pstmt.executeQuery();
			
			vo = new PayVO();
			 
			while(rs.next()){
				vo.setPj_name(rs.getString("pj_name"));
				vo.setSo_price(rs.getInt("so_price"));
				vo.setSo_amount(rs.getInt("so_amount"));
				vo.setSponsor_order_detail_num(rs.getInt("sponsor_order_detail_num"));
				vo.setPj_num(rs.getInt("pj_num"));
				vo.setPj_goods_num(rs.getInt("pj_goods_num"));
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vo;
	}
	
	
	
	/**주소 insert*/
	public boolean insertaddress(String addr, String name, String id, String addr1, int postcode){
		boolean result = false;
		try {
			
			String sql = "insert into sponsor_order(addr, perform_date, status, name, id, addr1, postcode) "
					+ "values(?, now(), '배송준비중', ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, addr);
			pstmt.setString(2, name);
			pstmt.setString(3, id);
			pstmt.setString(4, addr1);
			pstmt.setInt(5, postcode);
			
			if(pstmt.executeUpdate() == 1)
				result=true;

		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	/**sponsor_order_num 찾기*/
	public PayVO select(){
		ArrayList<PayVO> list = new ArrayList();
		PreparedStatement pstmt;
		ResultSet rs;
		PayVO vo = null;
		
		try {
			String sql = "select sponsor_order_num "
					+ "from sponsor_order "
					+ "order by sponsor_order_num desc limit 1;";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			vo = new PayVO();
			 
			while(rs.next()){
				vo.setSponsor_order_num(rs.getInt("sponsor_order_num"));
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vo;
	}
	
	/**update sponsor_order_num */
	public boolean updatespon(int sponsor_order_num, int so_price){
		boolean result = false;
		try{
			String sql = "update sponsor_order_detail "
					+ "set sponsor_order_num = ? where so_price = ? "
					+ "order by sponsor_order_detail_num desc limit 1;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sponsor_order_num);
			pstmt.setInt(2, so_price);

			if(pstmt.executeUpdate() == 1){
				result = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	/** 구매한 후원품 검색 2 */
	public PayVO selectspons(int pj_num, int pj_goods_num){
		ArrayList<PayVO> list = new ArrayList();
		PreparedStatement pstmt;
		ResultSet rs;
		PayVO vo = null;
		
		try {
			String sql = "select project.pj_name, sponsor_order_detail.so_price, sponsor_order_detail.so_amount, "
					+ "sponsor_order_detail.sponsor_order_detail_num, project.pj_num, "
					+ "pj_goods.pj_goods_num , sponsor_order.addr, sponsor_order.addr1, sponsor_order.name, sponsor_order.postcode "
					+ "from project, pj_goods, sponsor_order_detail, sponsor_order "
					+ "where project.pj_num = pj_goods.pj_num and "
					+ "pj_goods.pj_goods_num = sponsor_order_detail.pj_goods_num and "
					+ "sponsor_order_detail.sponsor_order_num = sponsor_order.sponsor_order_num and "
					+ "project.pj_num = ? and pj_goods.pj_goods_num = ? "
					+ "order by sponsor_order_detail_num desc limit 1";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pj_num);
			pstmt.setInt(2, pj_goods_num);
			rs = pstmt.executeQuery();
			
			vo = new PayVO();
			 
			while(rs.next()){
				vo.setPj_name(rs.getString("pj_name"));
				vo.setSo_price(rs.getInt("so_price"));
				vo.setSo_amount(rs.getInt("so_amount"));
				vo.setSponsor_order_detail_num(rs.getInt("sponsor_order_detail_num"));
				vo.setPj_num(rs.getInt("pj_num"));
				vo.setPj_goods_num(rs.getInt("pj_goods_num"));
				vo.setAddr(rs.getString("addr"));
				vo.setAddr1(rs.getString("addr1"));
				vo.setName(rs.getString("name"));
				vo.setPostcode(rs.getInt("postcode"));
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vo;
	}
	
	
	/** 후원할 프로젝트 검색  */
	public PayVO selectnumm(int pj_num){
		ArrayList<PayVO> list = new ArrayList();
		PreparedStatement pstmt;
		ResultSet rs;
		PayVO vo = null;
		
		try {
			String sql = "select pj_goods.pj_goods_num, pj_goods.goods_price,"
					+ "pj_goods.goods_name from project, pj_goods "
					+ "where project.pj_num = pj_goods.pj_num and project.pj_num = ? and "
					+ "pj_goods.pj_goods_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pj_num);
			rs = pstmt.executeQuery();
			
			vo = new PayVO();
			 
			while(rs.next()){
				vo.setPj_goods_num(rs.getInt("pj_goods_num"));
				vo.setGoods_price(rs.getInt("goods_price"));
				vo.setGoods_name(rs.getString("goods_name"));
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vo;
	}
	
	/** 프로젝트 후원  */
	public boolean insertspongoodss(int spon_price, String id, int pj_num){
		boolean result = false;
		try {
			
			String sql = "insert into spon_order(spon_price, spon_date, "
					+ "id, pj_num) values(?, now(), ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, spon_price);
			pstmt.setString(2, id);
			pstmt.setInt(3, pj_num);
			
			if(pstmt.executeUpdate() == 1)
				result=true;

		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	/** 후원한 프로젝트 검색  */
	public PayVO selectsponn(int pj_num){
		ArrayList<PayVO> list = new ArrayList();
		PreparedStatement pstmt;
		ResultSet rs;
		PayVO vo = null;
		
		try {
			String sql = "select project.pj_name, spon_order.spon_order_num, spon_order.spon_price, "
					+ "spon_order.id, project.pj_num "
					+ "from project, spon_order, users "
					+ "where project.pj_num = spon_order.pj_num and users.id = spon_order.id "
					+ "and project.pj_num = ? "
					+ "order by spon_order.spon_order_num desc limit 1";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pj_num);
			rs = pstmt.executeQuery();
			
			vo = new PayVO();
			 
			while(rs.next()){
				vo.setPj_name(rs.getString("pj_name"));
				vo.setSpon_order_num(rs.getInt("spon_order_num"));
				vo.setSpon_price(rs.getInt("spon_price"));
				vo.setId(rs.getString("id"));
				vo.setPj_num(rs.getInt("pj_num"));
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vo;
	}
	
	/**재고량 update*/
	public int updateProjectStore(int sponsor_order_detail_num){
		PreparedStatement pstmt = null;

		String sql = "update pj_goods a inner join sponsor_order_detail b "
				+ "on a.pj_goods_num = b.pj_goods_num "
				+ "set a.store = store-so_amount "
				+ "where sponsor_order_detail_num = ?";

		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sponsor_order_detail_num);
			return pstmt.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		}
		return -1; // 데이터 베이스 오류

	}
	
}