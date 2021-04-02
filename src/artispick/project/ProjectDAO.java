package artispick.project;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import artispick.mypage.MypageVO;


public class ProjectDAO {
	private Connection conn;
	private int noOfRecords;

	/**1,2동작은 재사용하기 위해서 생성자 구현*/
	public ProjectDAO(){
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


	public ArrayList<ProjectVO> getPjList(int offset,int noOfRecords){
		ArrayList<ProjectVO> list = new ArrayList();
		String sql = "select project.pj_num, project.image, project.pj_name, artist.arti_name, "
				+ "DATEDIFF(project.deadline,curdate()) as 마감일, project.total_price, "
				+ "ROUND(project.total_price / project.target * 100) as 퍼센트 "
				+ "from project, artist, users where artist.id = project.id and "
				+ "users.id = artist.id group by pj_name order by upload_date desc limit "+ offset + " , " + noOfRecords;
		ProjectVO projectVO = null;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				list.add(new ProjectVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4),
						rs.getInt("마감일"), rs.getInt(6),
						rs.getInt(7)));
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



//	/**분야 별 프로젝트 보기 ㄴㄴ**/
//	public ArrayList<ProjectVO> getPjField(String field){
//		ArrayList<ProjectVO> list = new ArrayList();
//		String sql = "select pj_num, projects.image, pj_name, arti_name, deadline-curdate() as '마감일', "
//				+ "total, ROUND(total / target * 100) as '퍼센트' "
//				+ "from projects, artists "
//				+ "where artists.arti_num=projects.arti_num and field=?"
//				+ "order by upload desc limit 1,12";
//		try {
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//			while(rs.next())
//				list.add(new ProjectVO(rs.getString(1), rs.getString(2), 
//						rs.getString(3), rs.getString(4),
//						rs.getInt("마감일"), rs.getInt(6),
//						rs.getInt(7)));
//			rs.close();
//			stmt.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		return list;
//	}

	/** 프로젝트 제목 검색-12개 ㄴㄴ */
	public ArrayList<ProjectVO> getPjSearch(String pjName){
		ArrayList<ProjectVO> list = new ArrayList();
		String sql = "select pj_num, projects.image, pj_name, arti_name, DATEDIFF(deadline,curdate()) as '마감일', "
				+ "total, ROUND(total / target * 100) as '퍼센트' "
				+ "from projects, artists "
				+ "where artists.arti_num=projects.arti_num and pj_name like ? "
				+ "order by upload "
				+ "desc limit 1,12";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
				list.add(new ProjectVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4),
						rs.getInt("마감일"), rs.getInt(6),
						rs.getInt(7)));
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	/**후원한 프로젝트 보기 4개씩 oo*/
	public ArrayList<ProjectVO> getsponsorList() {
		ArrayList<ProjectVO> list = new ArrayList();
		String sql = "select project.pj_num, project.image, project.pj_name, artist.arti_name, "
				+ "DATEDIFF(project.deadline,curdate()) as 마감일, project.total_price, "
				+ "ROUND(project.total_price / project.target * 100) as 퍼센트 "
				+ "from project, artist, users where artist.id = project.id and users.id = artist.id "
				+ "group by pj_num order by total_price desc limit 0,4";

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
				list.add(new ProjectVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4),
						rs.getInt("마감일"), rs.getInt(6),
						rs.getInt(7)));
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	/**인기순 프로젝트 확인-4개 ok*/
	public ArrayList<ProjectVO> getPopList() {
		ArrayList<ProjectVO> list = new ArrayList();
		String sql = "select project.pj_num, project.image, project.pj_name, artist.arti_name, "
				+ "DATEDIFF(project.deadline,curdate()) as 마감일, project.total_price, "
				+ "ROUND(project.total_price / project.target * 100) as 퍼센트 "
				+ "from project, artist, users where artist.id = project.id and users.id = artist.id "
				+ "and DATEDIFF(project.deadline,curdate()) > 0 "
				+ "group by pj_num order by total_price desc limit 0,4";

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
				list.add(new ProjectVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4),
						rs.getInt("마감일"), rs.getInt(6),
						rs.getInt(7)));
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	/**뉴 프로젝트 확인-4개 ok**/
	public ArrayList<ProjectVO> getNewList(){
		ArrayList<ProjectVO> list = new ArrayList();
		String sql = "select project.pj_num, project.image, project.pj_name, artist.arti_name, "
				+ "DATEDIFF(project.deadline,curdate()) as 마감일, project.total_price, "
				+ "ROUND(project.total_price / project.target * 100) as 퍼센트 "
				+ "from project, artist, users where artist.id = project.id and "
				+ "users.id = artist.id and DATEDIFF(project.deadline,curdate()) > 0 "
				+ "group by pj_num order by project.pj_num desc limit 0,4;";

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
				list.add(new ProjectVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4),
						rs.getInt("마감일"), rs.getInt(6),
						rs.getInt(7)));
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	/**종료될 프로젝트 확인-4개 ok**/
	public ArrayList<ProjectVO> getDeadList(){
		ArrayList<ProjectVO> list = new ArrayList();
		String sql = "select project.pj_num, project.image, project.pj_name, artist.arti_name, "
				+ "DATEDIFF(project.deadline,curdate()) as 마감일, project.total_price, "
				+ "ROUND(project.total_price / project.target * 100) as 퍼센트 "
				+ "from project, artist, users where artist.id = project.id and "
				+ "users.id = artist.id and DATEDIFF(project.deadline,curdate()) > 0 "
				+ "group by pj_num order by DATEDIFF(project.deadline,curdate()) asc limit 0,4";

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
				list.add(new ProjectVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4),
						rs.getInt("마감일"), rs.getInt(6),
						rs.getInt(7)));
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	/**분야의 프로젝트는 총 몇개인가**/
	public int selectFieldCount(String field){
		int fieldCount=0;
		String sql = "select pj_num, field, count(pj_name) from projects "
				+ "where field = ? group by field desc limit 1,12";
		try{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, field);
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()){
				fieldCount = rs.getInt(1);
			}

			rs.close();
			pstmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return fieldCount;
	}


	/**최다후원순 12개**/
	public ArrayList<ProjectVO> getsponList(int offset,int noOfRecords) throws Exception{
		ArrayList<ProjectVO> list = new ArrayList();
		String sql = "select project.pj_num, project.image, project.pj_name, "
				+ "artist.arti_name, DATEDIFF(deadline,curdate()) as 마감일, "
				+ "project.total_price as 모인금액, ROUND(project.total_price / project.target * 100) as 퍼센트, "
				+ "count(sponsor_order.id) as 후원자수 from project, pj_goods, sponsor_order, artist "
				+ "where artist.id=project.id and sponsor_order.id=project.id "
				+ "and project.pj_num=pj_goods.pj_num and DATEDIFF(project.deadline,curdate()) > 0 group by project.pj_num, project.image, project.pj_name, "
				+ "DATEDIFF(deadline,curdate()), total_price,  "
				+ "ROUND(total_price / target * 100) desc limit "+ offset + " , " + noOfRecords;

		try {
			Statement stmt = conn.createStatement();//생성을 안했을떄 문제는 .앞이 문제임!
			ResultSet rs = stmt.executeQuery(sql);   
			//select니까 ResultSet! 레코드 여러개니까 while문!
			//여러개지만 몇개 들어올 지 알 수 없음!
			while(rs.next()){
				list.add(new ProjectVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4),
						rs.getInt("마감일"), rs.getInt(6),
						rs.getInt(7)));
			}
			rs.close();
			rs=stmt.executeQuery("select found_rows()");
			if(rs.next())
				this.noOfRecords = rs.getInt(1);			
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}
	

	
	/** 프로젝트 수정  */
	public boolean updateProject(String pjStory, String refund, String pjName){
		boolean result = false;
		try{
		String sql = "update projects set pj_story=?, refund=? where pj_name = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, pjStory);
		pstmt.setString(2, refund);
		pstmt.setString(3, pjName);
		
		if(pstmt.executeUpdate() == 1)
			result = true;
		
		pstmt.close();

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
					+ "on a.pj_name = b.pj_name set total_price = totals";
			pstmt = conn.prepareStatement(sql);
			if(pstmt.executeUpdate() == 1){
				result = true;
			}pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	
	/**만든 프로젝트 리스트-12개 ok*/
	public ArrayList<ProjectVO> getPjListin(String id){
		ArrayList<ProjectVO> list = new ArrayList();
		
		try {
			String sql = "select project.pj_num, project.image, project.pj_name, artist.arti_name, "
					+ "DATEDIFF(project.deadline,curdate()) as 마감일, project.total_price, "
					+ "ROUND(project.total_price / project.target * 100) as 퍼센트 "
					+ "from project, artist, users where artist.id = project.id and "
					+ "users.id = artist.id and users.id = ? and DATEDIFF(project.deadline,curdate()) > 0 group by pj_name order by upload_date desc limit 0,12";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				list.add(new ProjectVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4),
						rs.getInt("마감일"), rs.getInt(6),
						rs.getInt(7)));
			}
			rs.close();
			pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	

	/**만든 프로젝트 갯수*/
	public ProjectVO getsponsorCountt(String id) {
		PreparedStatement pstmt;
		ResultSet rs;
		ProjectVO vo = null;
		
		try {
			String sql = "select count(users.id)  as count "
					+ "from project, artist, users where artist.id = project.id and "
					+ "users.id = artist.id and users.id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();

			vo = new ProjectVO(); 
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
	

/**인기순 프로젝트 정렬*/
	public ArrayList<ProjectVO> popList(int offset,int noOfRecords) {
		ArrayList<ProjectVO> list = new ArrayList();
		String sql = "select project.pj_num, project.image, project.pj_name, artist.arti_name, "
				+ "DATEDIFF(project.deadline,curdate()) as 마감일, project.total_price, "
				+ "ROUND(project.total_price / project.target * 100) as 퍼센트 "
				+ "from project, artist, users where artist.id = project.id and users.id = artist.id and DATEDIFF(project.deadline,curdate()) > 0 "
				+ "group by pj_name order by total_price desc limit "+ offset + " , " + noOfRecords;

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				list.add(new ProjectVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4),
						rs.getInt("마감일"), rs.getInt(6),
						rs.getInt(7)));
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
	
/**마감임박순 프로젝트 정렬*/
public ArrayList<ProjectVO> endList(int offset,int noOfRecords) {
		ArrayList<ProjectVO> list = new ArrayList();
		String sql = "select project.pj_num, project.image, project.pj_name, artist.arti_name, "
				+ "DATEDIFF(project.deadline,curdate()) as 마감일, project.total_price, "
				+ "ROUND(project.total_price / project.target * 100) as 퍼센트 "
				+ "from project, artist, users where artist.id = project.id and users.id = artist.id and DATEDIFF(project.deadline,curdate()) > 0 "
				+ "group by pj_name order by DATEDIFF(project.deadline,curdate()) asc limit "+ offset + " , " + noOfRecords;

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				list.add(new ProjectVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4),
						rs.getInt("마감일"), rs.getInt(6),
						rs.getInt(7)));
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

/**전체 프로젝트 개수**/
public int projectCount() throws Exception{
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	int x=0;
	try{
	String sql = "select count(*)from project";
	pstmt=conn.prepareStatement(sql);
	rs=pstmt.executeQuery();
	
	if(rs.next())
		x=rs.getInt(1);
	
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(rs!=null)try{rs.close();}catch(SQLException ex){}
		if(pstmt!=null)try{pstmt.close();}catch(SQLException ex){}
	}
	return x;
}


	
}
