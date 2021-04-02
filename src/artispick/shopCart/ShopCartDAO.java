package artispick.shopCart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShopCartDAO {
	private Connection conn;
	
	public ShopCartDAO(){
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
	
	/**장바구니담기*/
	public boolean inserShopCart(int shop_num, String id, int amount, String shop_title, int price){
		boolean result = false;
		try {
			String sql = "insert into shop_cart(shop_num, id, amount,shop_title, price) values(?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, shop_num);
			pstmt.setString(2, id);
			pstmt.setInt(3, amount);
			pstmt.setString(4, shop_title);
			pstmt.setInt(5, price);
			
			if(pstmt.executeUpdate()==1)
				result=true;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	/**id에 해당하는 레코드 수**/
	public int getListCount(String id){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = 0;
		
		try{
			String sql = "select count(*) from shop_cart where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				x=rs.getInt(1);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs!=null) try{rs.close();} catch(SQLException e){}
			if(pstmt!=null) try{pstmt.close();} catch(SQLException e){}
		}
		return x;
	}
	
	/**id에 해당하는 목록*/
	public ArrayList<ShopCartVO> getCart(String id) throws Exception{
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ShopCartVO> list=new ArrayList();
		
		try{
			String sql="select shop_cart_num, shop_num, id, amount,shop_title, price from shop_cart where id=?";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			
			while(rs.next()){
				list.add(new ShopCartVO(rs.getInt(1), rs.getInt(2), rs.getString(3), 
						rs.getInt(4), rs.getString(5), rs.getInt(6)));
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs!=null) try{rs.close();} catch(SQLException e){}
			if(pstmt!=null) try{pstmt.close();} catch(SQLException e){}
		}
		
		return list;
	}
	
	/**장바구니 수량 수정*/
	public boolean updateCount(int shop_cart_num, int amount){
		PreparedStatement pstmt = null;
		boolean result = false;
		
		try{
			pstmt=conn.prepareStatement("update shop_cart set amount=? where shop_cart_num=?");
			pstmt.setInt(1, amount);
			pstmt.setInt(2, shop_cart_num);
			if(pstmt.executeUpdate()==1)
				result=true;
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{

			if(pstmt!=null) try{pstmt.close();} catch(SQLException e){}
		}
		return result;
	}
	
	/**특정 상품 삭제*/
	public void deleteList(int shop_cart_num){
		PreparedStatement pstmt = null;
		
		try{
			pstmt=conn.prepareStatement("delete from shop_cart where shop_cart_num=?");
			pstmt.setInt(1, shop_cart_num);
			
			pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{

			if(pstmt!=null) try{pstmt.close();} catch(SQLException e){}
		}

	}
	
	/**전체 상품 삭제*/
	public void deleteAll(String id){
		PreparedStatement pstmt = null;
		
		try{
			pstmt=conn.prepareStatement("delete from shop_cart where id=?");
			pstmt.setString(1, id);
			
			pstmt.executeUpdate();
				
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{

			if(pstmt!=null) try{pstmt.close();} catch(SQLException e){}
		}
	
	}
}
