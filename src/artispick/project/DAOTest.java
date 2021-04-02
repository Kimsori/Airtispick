package artispick.project;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DAOTest {
	public static void main(String[] args) throws ParseException{
//		ProjectPlusDAO co = new ProjectPlusDAO();
////		System.out.println(co.getsponsorList());
//		System.out.println(co.selectId("eifldc45"));
//		ProjectBuyDAO co = new ProjectBuyDAO();
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = format.parse("2018-11-11");
//		System.out.println(co.buyProject("서울시", date, "배송중", "김소리", "noksm2", 1, date, 12000, 1, 1));
				
//		ProjectPlusDAO co = new ProjectPlusDAO();
//		
//		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
//		String today = formatter.format(new java.util.Date());
//		
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = format.parse("2018-11-11");
//		Date date1 = format.parse("2018-11-11");
//		Date date2 = format.parse("2018-11-11");
//		
//		System.out.println(co.insertProject("bbb", "asdf",  1234, 1234, date, date, "asdf", "asdf", "asdf", "asdf", 1234, "noksm2", 1));
//		System.out.println(co.insertProject2(1234, "asdf", 1234, 75));
//		System.out.println(co.insertProject2(1234, "asdf", 1234, 75));
//		
		ProjectPlusDAO co = new ProjectPlusDAO();
		System.out.println(co.insertProject("1234", "1234", 1,3, "1234", "1234", "1234", "1234", 0, "noksm2", 2));
		System.out.println("프로그램 강제 종료 상황 확인 end"); 
	}
	
	
}
