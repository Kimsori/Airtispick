package artispick.mypage;

public class DAOTest {
	public static void main(String[] args) {
		MypageDAO co = new MypageDAO();
		System.out.println(co.getsponsorListt("noksm2"));
		System.out.println(co.getsponsorCountt("noksm2"));
		
		
		System.out.println("프로그램 강제 종료 상황 확인 end"); 
	}
}
