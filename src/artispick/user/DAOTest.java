package artispick.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DAOTest {
	public static void main(String[] args) throws ParseException {
		UserDAO co = new UserDAO();
//		System.out.println(co.register("no2", "addaa", "윤가원", 19950303, 1034569282, "여자", "sdfh@naver.com", null, null, null));
//		System.out.println(co.idFind("김소리", 1065784896));
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = format.parse("1999-04-04");
//		Date date2 = format.parse("2015-08-12");
//		Date date3 = format.parse("2018-04-04");
//		
//		System.out.println(co.register("mnbv", "ee", "윤서현", date, "01098756542", "남자", "qqqq@d.com",  2));
//		System.out.println(co.selectId("mnbv"));
//		System.out.println(co.register2("mnbv", "ee", "윤서현", "01098756542"));

		
		
		System.out.println(co.select1()); 
		System.out.println("프로그램 강제 종료 상황 확인 end"); 
		
	}
}
