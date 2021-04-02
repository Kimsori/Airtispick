package artispick.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import artispick.project.ProjectVO;

public class AdminDAO {
	private Connection conn;
	private int noOfRecords;
	
	public AdminDAO(){
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
public ArrayList<AdminVO> notice(int offset,int noOfRecords){
		
		ArrayList<AdminVO> list = new ArrayList();
		String sql = "select notice_num, title, notice_date, view, admin_id from notice "
				+ "order by notice_num desc limit "+ offset + " , " + noOfRecords;
		AdminVO adminVO = null;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				list.add(new AdminVO(rs.getInt(1), rs.getString(2), rs.getDate(3), 
						rs.getInt(4), rs.getString(5)));
			}
			rs.close();
			
			rs=stmt.executeQuery("select found_rows()");
			if(rs.next())
				this.noOfRecords = rs.getInt(1);
			
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
		
	}
	public int getNoOfRecords() {
        return noOfRecords;
    }

}
