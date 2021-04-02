package artispick.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import artispick.mypage.MypageVO;
import artispick.pay.PayVO;
import artispick.project.ProjectVO;

public class ShopDAO {
	private Connection conn;
	
	public ShopDAO(){
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
	
	
	/**샵 리스트-12개 ok*/
	public ArrayList<ShopVO> getShopList(){
		ArrayList<ShopVO> list = new ArrayList();
		String sql = "select shop_num, album_name, album_price, store, image from shop "
				+ "order by shop_num desc limit 0,12";

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
				list.add(new ShopVO(rs.getInt(1), rs.getString(2), 
						rs.getInt(3), rs.getInt(4),
						rs.getString(5)));
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	/** 샵 상세 검색  */
	public ShopVO selectshopdetail(int shop_num){
		ArrayList<ShopVO> list = new ArrayList();
		PreparedStatement pstmt;
		ResultSet rs;
		ShopVO vo = null;
		
		try {
			String sql = "select shop_num, album_name, field_name, album_price, "
					+ "album_content, store, delivery_account, image, delivery_date, "
					+ "bank, bank_account, name from shop, field "
					+ "where shop.field_num = field.field_num and shop_num = ?;";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, shop_num);
			rs = pstmt.executeQuery();
			
			vo = new ShopVO();
			 
			while(rs.next()){
				vo.setShop_num(rs.getInt("shop_num"));
				vo.setAlbum_name(rs.getString("album_name"));
				vo.setField_name(rs.getString("field_name"));
				vo.setAlbum_price(rs.getInt("album_price"));
				vo.setAlbum_content(rs.getString("album_content"));
				vo.setStore(rs.getInt("store"));
				vo.setDelivery_account(rs.getInt("delivery_account"));
				vo.setImage(rs.getString("image"));
				vo.setDelivery_date(rs.getDate("delivery_date"));
				vo.setBank(rs.getString("bank"));
				vo.setBank_account(rs.getInt("bank_account"));
				vo.setName(rs.getString("name"));
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vo;
	}
	
	/**샵 주문내역*/
	public ArrayList<ShopVO> selectshoporder(String id){
		ArrayList<ShopVO> list = new ArrayList();
		
		try {
			String sql = "select shop_order.order_date, shop.album_name, "
					+ "shop_order.amount, shop_order.price, "
					+ "shop.delivery_account+shop_order.amount*shop_order.price as total, "
					+ "shop_order_detail.status from shop, shop_order, shop_order_detail "
					+ "where shop.shop_num = shop_order_detail.shop_num and "
					+ "shop_order.shop_order_detail_num = shop_order_detail.shop_order_detail_num and "
					+ "shop_order.id = ? order by shop_order_detail.shop_order_detail_num "
					+ "desc limit 0,12";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				list.add(new ShopVO(rs.getDate(1), rs.getString(2), 
						rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6)));
			}
			 
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	/**샵 구매*/
	public boolean insertshopgoods(String addr, String addr2, int postcard, int shop_num, String name){
		boolean result = false;
		try {
			
			String sql = "INSERT INTO shop_order_detail(addr, addr2, postcard, perform_date, status, shop_num, name) "
					+ "VALUES (?,?,?,now()+2,'배송준비중',?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, addr);
			pstmt.setString(2, addr2);
			pstmt.setInt(3, postcard);
			pstmt.setInt(4, shop_num);
			pstmt.setString(5, name);
			
			if(pstmt.executeUpdate() == 1)
				result=true;

		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	/**shop_order_detail_num 찾기*/
	public ShopVO select(){
		ArrayList<ShopVO> list = new ArrayList();
		PreparedStatement pstmt;
		ResultSet rs;
		ShopVO vo = null;
		
		try {
			String sql = "select shop_order_detail_num "
					+ "from shop_order_detail "
					+ "order by shop_order_detail_num desc limit 1;";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			vo = new ShopVO();
			 
			while(rs.next()){
				vo.setShop_order_detail_num(rs.getInt("shop_order_detail_num"));
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vo;
	}
	
	/**샵 구매2*/
	public boolean insertshopgoods2(int amount, int price, int shop_order_detail_num, String id){
		boolean result = false;
		try {
			
			String sql = "INSERT INTO shop_order(amount, price, order_date, "
					+ "shop_order_detail_num, id) VALUES (?,?,now(),?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, amount);
			pstmt.setInt(2, price);
			pstmt.setInt(3, shop_order_detail_num);
			pstmt.setString(4, id);
			
			if(pstmt.executeUpdate() == 1)
				result=true;

		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	/**재고량 update*/
	public int updateProjectStore(int sponsor_order_detail_num){
		PreparedStatement pstmt = null;

		String sql = "update shop a join shop_order_detail b "
				+ "on a.shop_num = b.shop_num "
				+ "join shop_order c "
				+ "on b.shop_order_detail_num = c.shop_order_detail_num "
				+ "set a.store = a.store-c.amount "
				+ "where c.shop_order_detail_num = ?";

		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sponsor_order_detail_num);
			return pstmt.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		}
		return -1; // 데이터 베이스 오류

	}
	
	/** 정산  */
	public ArrayList<ShopVO> calculate(String id){
		ArrayList<ShopVO> list = new ArrayList();
		
		try {
			String sql = "select di.pj_name, project.total_price, sum(di.10만+di.15만+di.20만) as achiev, "
					+ "project.total_price-sum(di.10만+di.15만+di.20만) as totaldivi, "
					+ "date_add(di.perform_date, interval 14 day) as dividate "
					+ "from di, project, artist, shop where di.pj_num = project.pj_num and "
					+ "project.id = artist.id and project.deadline < now() and "
					+ "project.pj_num = shop.pj_num and project.total_price >= project.target and "
					+ "artist.id = ? group by di.pj_name order by di.pj_num desc";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				list.add(new ShopVO(rs.getString(1), rs.getInt(2), 
						rs.getInt(3), rs.getInt(4),
						rs.getDate(5)));
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	/** 후원자 별 정산  */
	public ArrayList<ShopVO> calculate2(String id){
		ArrayList<ShopVO> list = new ArrayList();
		
		try {
			String sql = "select di.pj_name, di.id, date_add(di.perform_date, interval 14 day) as dividatee, "
					+ "di.후원금 as sponprice, (di.10만+di.15만+di.20만) as totaldivie "
					+ "from di, project, artist, shop where di.pj_num = project.pj_num and "
					+ "project.id = artist.id and project.deadline < now() and "
					+ "project.pj_num = shop.pj_num and project.total_price >= project.target and "
					+ "(di.10만+di.15만+di.20만) > 0 and artist.id = ? order by di.pj_num desc";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				list.add(new ShopVO(rs.getString(1), rs.getString(2), 
						rs.getDate(3), rs.getInt(4),
						rs.getInt(5)));
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
}
