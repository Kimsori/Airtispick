package artispick.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import artispick.mypage.MypageVO;
import artispick.pay.PayVO;
import artispick.project.ProjectPlusVO;
import artispick.project.ProjectVO;

public class UserDAO {
	private Connection conn;

	public UserDAO(){
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
	
	/** 로그인  ok*/	
	public boolean login(String id, String passwd){
		PreparedStatement pstmt;
		ResultSet rs;
		boolean result = false;

		try{
			String sql = "select id, passwd from users where id=? and passwd=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2,passwd);
			rs=pstmt.executeQuery();
			if(rs.next())
				return true;				
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	/**아이디 찾기 ok**/
	public String idFind(String userName, String phone){
		String id = null;

		try{
			String sql = "select id from users where user_name=? and phone=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, phone);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next())
				id = rs.getString("id");
			rs.close();
			pstmt.close();	

		}catch(SQLException e){
			e.printStackTrace();
		}
		return id;
	}


	/**비밀번호 찾기 ok**/
	public String pwFind(String id, String phone, String userName){
		String passwd = null;
		try{
			String sql = "select passwd from users where id=? and phone=? and user_name=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, phone);
			pstmt.setString(3, userName);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next())
				passwd = rs.getString("passwd");
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return passwd;
	}
	
	/** 특정회원정보 가져오기*/
	public UserVO getUser(String id) {
		UserVO uVO= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from users where id=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				uVO = new UserVO();
				uVO.setId(rs.getString("id"));
				uVO.setPasswd(rs.getString("passwd"));
				uVO.setUserName(rs.getString("user_name"));
				uVO.setBirth(rs.getDate("birth"));
				uVO.setPhone(rs.getString("phone"));
				uVO.setGender(rs.getString("gender"));
				uVO.setEmail(rs.getString("email"));
				uVO.setField(rs.getInt("field"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return uVO;
	}
	
	/** 회원정보 수정*/
	public boolean updateUser(String passwd, String userName, String email, String phone,String id){
		boolean result = false;
		try{
			String sql = "update users set passwd=?, user_name=?, email=?, phone=? where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, passwd);
			pstmt.setString(2, userName);
			pstmt.setString(3, email);
			pstmt.setString(4, phone);
			pstmt.setString(5, id);
	
			if(pstmt.executeUpdate() == 1)
				result = true;

			pstmt.close();

		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}

	/** 회원가입 ok*/
//	public boolean register(String id, String passwd, String userName, Date birth, 
//			String phone, String gender, String email, int field, String artiName, String intro, String artiProfile){
//		boolean result = false;
//		PreparedStatement pstmt;
//		try {
//			String sql = "insert into users(id, passwd, user_name, "
//					+ "birth, phone, gender, email, field_num)"
//					+ " values(?, ?, ?, ?, ?, ?, ?, ?)";
//
//
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, id);
//			pstmt.setString(2, passwd);
//			pstmt.setString(3, userName);
//			pstmt.setDate(4, new java.sql.Date(birth.getTime()));
//			pstmt.setString(5, phone);
//			pstmt.setString(6, gender);
//			pstmt.setString(7, email);
//			pstmt.setInt(8, field);
//			
//			if(pstmt.executeUpdate() == 1)
//				result = true;	
//
//			String sql1 = "insert into artist(id, arti_name, intro, arti_profile) "
//					+ "values(?, ?, ?, ?)";
//
//			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
//			pstmt1 = conn.prepareStatement(sql1);
//			pstmt1.setString(1, id);
//			pstmt1.setString(2, artiName);
//			pstmt1.setString(3, intro);
//			pstmt1.setString(4, artiProfile);
//
//			if(pstmt1.executeUpdate() == 1)
//				result=true;
//			
//			pstmt.close();
//
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
//		return result;
//
//	}
	
	/** 회원가입  */
	public boolean register(String id, String passwd, String userName, Date birth, 
			String phone, String gender, String email, int field){
		boolean result = false;
		try {
			String sql = "insert into users(id, passwd, user_name, "
					+ "birth, phone, gender, email, field_num)"
					+ " values(?, ?, ?, ?, ?, ?, ?, ?)";


			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			pstmt.setString(3, userName);
			pstmt.setDate(4, new java.sql.Date(birth.getTime()));
			pstmt.setString(5, phone);
			pstmt.setString(6, gender);
			pstmt.setString(7, email);
			pstmt.setInt(8, field);
			
			if(pstmt.executeUpdate() == 1)
				result = true;	

		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;

	}
	
	/** 아이디 검색  */
	public UserVO selectId(String id){
		UserVO vo = null;
		String sql = "select id "
				+ "from users "
				+ "where id = ? order by id desc limit 1";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new UserVO();
				vo.setId(rs.getString("id"));
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vo;
	}
	
	
	/** 창작자 회원가입  */
	public boolean register2(String id, String artiName, String intro, String artiProfile){
		boolean result = false;
		try {
			String sql = "insert into artist(id, arti_name, intro, arti_profile) "
					+ "values(?, ?, ?, ?)";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, artiName);
			pstmt.setString(3, intro);
			pstmt.setString(4, artiProfile);
			
			if(pstmt.executeUpdate() == 1)
				result = true;	
			
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
			String sql = "update project a inner join total_spon b "
					+ "on a.pj_name = b.pj_name set total_price = totals;";
			pstmt = conn.prepareStatement(sql);
			if(pstmt.executeUpdate() == 1){
				result = true;
			}pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}

	

	/** id중복체크  ok*/ 
	public boolean confirmId(String id){
		boolean result = false;

		try{
			String sql = "select id from users where id = ?";
			PreparedStatement pstmt;
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs=pstmt.executeQuery();

			if(rs.next())
				result=true;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}

	

	/** 회원정보 삭제 ok */
	public boolean deleteUser(String id, String passwd) {
		PreparedStatement pstmt;
		boolean result = false; 

		try {
			String sql = "delete from users where id = ? and passwd = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);

			if(pstmt.executeUpdate() == 1)
				result = true;	

			pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}
	
	/**id 찾기*/
	public ArrayList<UserVO> select1() {
		ArrayList<UserVO> list = new ArrayList();
		String sql = "select id from users";

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
				list.add(new UserVO(rs.getString(1)));
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	/**artist.id 찾기*/
	public ArrayList<UserVO> select2() {
		ArrayList<UserVO> list = new ArrayList();
		String sql = "select artist.id as id from users, artist where users.id = artist.id";

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
				list.add(new UserVO(rs.getString(1)));
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}
