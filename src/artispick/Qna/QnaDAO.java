package artispick.Qna;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class QnaDAO {
	private Connection conn;
	private int noOfRecords;
	/**1,2동작은 재사용하기 위해서 생성자 구현*/
	public QnaDAO(){
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

	/**문의 보내기=입력*/
	public boolean insertQna(String qna_title, String qna_content, String id){
		boolean result = false;
		try {
			
			String sql = "insert into QNA(qna_title, qna_content, id) values(?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, qna_title);
			pstmt.setString(2, qna_content);
			pstmt.setString(3, id);
			
			if(pstmt.executeUpdate() == 1)
				result=true;

		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	/**회원문의내역가져오기*/
	public ArrayList<QnaVO> getQnaList(int offset,int noOfRecords,String id) throws Exception {
		ArrayList<QnaVO> list = new ArrayList<QnaVO>();
		String sql = "select qna_num, qna_title, qna_content, qna_status, id, admin_id from QNA where id=? "
				+ "order by qna_num limit "+ offset + " , " + noOfRecords;

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
				list.add(new QnaVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), 
						rs.getString(5),rs.getString(6)));
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	public int getNoOfRecords() {
        return noOfRecords;
    }
}
