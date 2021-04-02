package artispick.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import artispick.Qna.QnaDAO;
import artispick.Qna.QnaVO;
import artispick.admin.AdminDAO;
import artispick.admin.AdminVO;
import artispick.adminDatail.AdminDetailDAO;
import artispick.adminDatail.AdminDetailVO;
import artispick.mypage.MypageDAO;
import artispick.mypage.MypageVO;
import artispick.pay.PayDAO;
import artispick.pay.PayVO;
import artispick.project.ProjectBuyDAO;
import artispick.project.ProjectDAO;
import artispick.project.ProjectPlusDAO;
import artispick.project.ProjectPlusVO;
import artispick.project.ProjectVO;
import artispick.projectDetail.ProjectDetailDAO;
import artispick.projectDetail.ProjectDetailInDAO;
import artispick.projectDetail.ProjectDetailInVO;
import artispick.projectDetail.ProjectDetailVO;
import artispick.shop.ShopDAO;
import artispick.shop.ShopVO;
import artispick.shopCart.ShopCartDAO;
import artispick.shopCart.ShopCartVO;
import artispick.user.UserDAO;
import artispick.user.UserVO;

@WebServlet({ "/artispick" })
public class ArtiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count = 0;

	public void init(ServletConfig config) throws ServletException {
		System.out.println(++count+" init()");
	}

	public void destroy() {
		System.out.println(++count+" destroy()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		System.out.println(++count+" service()");
		//1)화면에서 입력받은 데이터를 처리 - request
		String cmd=request.getParameter("cmd");
		if(cmd==null) cmd="";
		String page="main.jsp";
		//2)DAO를 처리할 내용이 있으면 관련 메소드를 호출
		switch(cmd){
		case "login":
			page="login.jsp";
			break;
			
			
		case "popList":
			page=popList(request);
			break;

		case "maxspon":
			try {
				page = maxspon(request);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
					
		case "endList":
			page=endList(request);
			break;

			
		case "loginAction":
			page=loginAction(request);
			break;
			
		case "geeetselectspon":
			page=geeetselectspon(request);
			break;
			
		case "geetselectspon":
			page=geetselectspon(request);
			break;
			
		case "logout":
			page=logout(request);
			break;
		
		case "idpassfind":
			page="idpassfind.jsp";
			break;
			
		case "about":
			page="about.jsp";
			break;
			
		case "payfin2":
			page="payfin2";
			break;
			
		case "idfindokay":
			page="idfindokay.jsp";
			page=idfind(request);
			break;
			
		case "idfind":
			page=idfind(request);
			break;
			
		case "pwfind":
			page=pwfind(request);
			break;
			
		case "pwfindokay":
			page="pwfindokay.jsp";
			break;
			
		case "main":
//			page=fieldListAction(request);
			page="main.jsp";
			page=pop(request);
			page=brandnew(request);
			page=fin(request);
			break;
			
		case "notice":
			page="notice.jsp";
			page=noti(request);
			break;
			
		case "noticedetail":
			page="noticedetail.jsp";
			break;
			
		case "pjlist":
			page="pjlist.jsp";
			try {
				page=list(request);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			page = field(request);
			break;
			
		case "getDetailProject":
			page=getDetailProject(request);
			break;
			
		case "getDetailProjectt":
			page=getDetailProjectt(request);
			break;
			
		case "getsponListttt":
			page=getsponListttt(request);
			break;

		case "pjdetail":
			page = "pjdetail.jsp";
			break;
			
		case "pjpost":
			page = "pjpost.jsp";
			break;
			
		case "postAction":
			page = postAction(request);
			break;
			
		case "buyAction":
			page = buyAction(request);
			break;
			
		case "register":
			page = "register.jsp";
			break;
			
		case "regiAction":
			page = regiAction(request);
			break;
			
		case "ggetsponsList":
			page = ggetsponsList(request);
			break;
			
		case "regiAction2":
			page = regiAction2(request);
			break;
			
		case "loginok":
			page = "loginok.jsp";
			break;
			
		case "credit2":
			page = "credit2.jsp";
			break;
			
		case "bank2":
			page = "bank2.jsp";
			break;
			
		case "searchList":
			page = "searchList.jsp";
			break;
			
		case "geetselectsponnn":	
			page=geetselectsponnn(request);
			break;
			
		case "searchListAction":	
			page=searchListAction(request);
			break;
			
		case "hasconfirmId":
			page = hasconfirmId(request);
			break;
			
		case "getDetailNotice":
			page=getDetailNotice(request);
			break;
			
		case "register2":
			page = "register2.jsp";
			break;
			
		case "mycart":
			page = "mycart.jsp";
			break;
			
		case "myorder":
			page = "myorder.jsp";
			break;
			
		case "mypage":
			page = "mypage.jsp";
			break;
			
		case "myproject":
			page = "myproject.jsp";
			break;
			
		case "mysponorder":
			page = "mysponorder.jsp";
			break;
			
		case "modify":
			page = "modify.jsp";
			break;
			
		case "getsponsorList":
			page=getsponsorList(request);
			break;
			
		case "getsponList": 
			page=getsponList(request);
			break;
			
		case "getsponsList": 
			page=getsponsList(request);
			break;
			
		case "getselectspon": 
			page=getselectspon(request);
			break;
			
		case "getselectspons": 
			page=getselectspons(request);
			break;
			
		case "getselectsponss": 
			page=getselectsponss(request);
			break;
			
		case "getsponsListt": 
			page=getsponsListt(request);
			break;
			
		case "getselectsponsss": 
			page=getselectsponsss(request);
			break;
			
		case "getselectsponssss": 
			page=getselectsponssss(request);
			break;
			
		case "spongoods":
			page = "spongoods.jsp";
			break;
			
		case "payment":
			page = "payment.jsp";
			break;
			
		case "getsponssList":
			page = getsponssList(request);
			break;
			
		case "getsponListt":
			page = getsponListt(request);
			break;
			
		case "credit":
			page = "credit.jsp";
			break;
			
		case "payment2":
			page = "payment2.jsp";
			break;
			
		case "spongoods2":
			page = "spongoods2.jsp";
			break;
			
		case "bank":
			page = "bank.jsp";
			break;
			
		case "address":
			page = "address.jsp";
			break;
			
		case "payfin":
			page = "payfin.jsp";
			break;
			
		case "fqa":
			page = "fqa.jsp";
			break;
			
		case "QnaWrite":
			page = "QnaWrite.jsp";
			break;
			
		case "getQnaList":
			try {
				page=getQnaList(request);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		case "message":
			page = "message.jsp";
			break;
			
		case "pjlistAction":
			page = pjlistAction(request);
			break;
			
		case "getUser":
			page=getUser(request);
			break;
				
		case "updateGetUser":
			page=updateGetUser(request);
			break;
			
		case "modifyUpload":
			page="modifyUpload.jsp";
			break;
			
			
			
		/** 상품*/	
		case "shoplist":
			page="shoplist.jsp";
			page=getgoodslist(request);
			break;
			
		case "shopdetail":
			page="shopdetail.jsp";
			break;
			
		case "shopdetailSelect":
			page=shopdetailSelect(request);
			break;
			
		case "shoporderSelect":
			page=shoporderSelect(request);
			break;
			
		case "shoporderInsert":
			page=shoporderInsert(request);
			break;
			
		case "shopdetailSelectgoods":
			page=shopdetailSelectgoods(request);
			break;
			
		case "shopgoodsok":
			page="shopgoodsok.jsp";
			break;
			
		case "calculate":
			page=calculate(request);
			break;
			
		case "shopbuy":
			page="shopbuy.jsp";
			break;
			
		case "Shopcart":
			try {
				page=Shopcart(request);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
			
			
			
		//장바구니	
		case "shopcart":
			page="shopcart.jsp";
			try {
				page=getShopcart(request);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
			
		}
		//3)업무의 결과페이지로 이동
		request.getRequestDispatcher("/"+page).forward(request, response);
	}
	
	private String getUser(HttpServletRequest request) {
		String id = request.getParameter("id");
		UserDAO dao = new UserDAO();
		UserVO vo = dao.getUser(id);
		request.setAttribute("vo", vo);
		return "modify.jsp";
		}

	private String updateGetUser(HttpServletRequest request) {
	UserDAO dao = new UserDAO();
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String userName = request.getParameter("userName");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	
	boolean result = dao.updateUser(passwd, userName, email, phone,id);
	
	UserVO vo = dao.getUser(id);
	request.setAttribute("vo", vo);
	if(result)
		return "artispick?cmd=modify";
	return "modifyUpload.jsp";
	}


	
//	/**댄스분야 검색*/
//	private String field(HttpServletRequest request) {
//		ProjectDAO dao = new ProjectDAO();
//		String field = "댄스";
//		ArrayList<ProjectVO> list = dao.getPjField(field);
//		request.setAttribute("field", list); // request는 response전에 사용되는 임시메모리
//		return "pjlist.jsp";
//	}

	
	
	/**로그아웃*/
	private String logout(HttpServletRequest request) {
		UserDAO dao = new UserDAO();
		HttpSession session = request.getSession(true);
		if(session!=null){
            session.invalidate();
        }
		return "artispick?cmd=main";
	}
	
	/**사용가능한 ID체크*/
	private String hasconfirmId(HttpServletRequest request) {
		UserDAO dao = new UserDAO();
		// request.getAttribute("result", dao.hasconfirmId(request.getParameter("id")));
		/*위에 껀 한번에 쓴거!*/
		String id = request.getParameter("id"); /*id를 담음*/
		if(!dao.confirmId(id)) /*내용물 체크하고*/
			request.setAttribute("hasId", "사용 가능한 아이디입니다!"); /*없으면 OK*/ /*회원가입할때는 아이디가 없어야됨!*/ /*hasid로 하는 이유는 업무상 있는 경우가 많아서*/
		else
			request.setAttribute("hasId", "사용 불가능한 아이디입니다."); /*있으면 NO*/
		return "hasconfirmId.jsp"; /*중복되도, 안되도 넘겨줘야 됨! 결과값*/
	}
	
	/**아이디 찾기*/
	private String idfind(HttpServletRequest request) throws ServletException, IOException{
		UserDAO dao = new UserDAO();
		String userName=request.getParameter("userName");
		String phone=request.getParameter("phone");
		String id = dao.idFind(userName, phone);
		request.setAttribute("id", id);
		
		if(id == null)
			return "idpassfind.jsp";
		return "idfindokay.jsp";
	}
	
	/**비밀번호 찾기*/
	private String pwfind(HttpServletRequest request) throws ServletException, IOException{
		UserDAO dao = new UserDAO();
		String userName=request.getParameter("userName");
		String phone=request.getParameter("phone");
		String id=request.getParameter("id");
		
		String passwd = dao.pwFind(id,phone,userName);
		request.setAttribute("passwd", passwd);
		
		if(passwd == null)
			return "idpassfind.jsp";
		return "pwfindokay.jsp";
	}
	
	/**로그인*/
	private String loginAction(HttpServletRequest request) throws ServletException, IOException{
		UserDAO dao = new UserDAO();
		String id=request.getParameter("id");
		String passwd=request.getParameter("passwd");
		
		HttpSession session = request.getSession(true);
		session.setAttribute("id", id);
		session.setAttribute("passwd", passwd);
		
		boolean result = dao.login(id,passwd);
		
//		ArrayList<UserVO> vo = dao.select1();
//		request.setAttribute("vo", vo);
//		
//		ArrayList<UserVO> ao = dao.select2();
//		request.setAttribute("ao", ao);
		
		if(result)
			return "artispick?cmd=main"; /*로그인 잘 되면 회원전용페이지로ㄱㄱ*/
		return "login.jsp";
	}

	/**만든 프로젝트 정렬*/
	private String pjlistAction(HttpServletRequest request) {
		ProjectDAO dao = new ProjectDAO();
		String id = request.getParameter("id");
		ArrayList<ProjectVO> list = dao.getPjListin(id);
		request.setAttribute("list", list);
		ProjectVO sponn = dao.getsponsorCountt(id);
		request.setAttribute("sponn", sponn);
		
		ShopDAO sao = new ShopDAO();
		ArrayList<ShopVO> shop = sao.calculate(id);
		request.setAttribute("shop", shop);
		
		ArrayList<ShopVO> shop2 = sao.calculate2(id);
		request.setAttribute("shop2", shop2);
		
		return "myproject.jsp";
	}
	
	/**후원한 후원품&프로젝트 정렬*/
	private String getsponsorList(HttpServletRequest request) {
		MypageDAO dao = new MypageDAO();
		String id = request.getParameter("id");
		ArrayList<MypageVO> list = dao.getsponsorList(id);
		MypageVO spon = dao.getsponsorCount(id);
		request.setAttribute("list", list);
		request.setAttribute("spon", spon);
		
		ArrayList<MypageVO> listt = dao.getsponsorListt(id);
		MypageVO sponn = dao.getsponsorCountt(id);
		request.setAttribute("listt", listt);
		request.setAttribute("sponn", sponn);
		return "mysponorder.jsp";
		
	}
	
	/**프로젝트 올리기*/
	private String postAction(HttpServletRequest request) throws ServletException, IOException{
		ProjectPlusDAO dao = new ProjectPlusDAO();
		request.setCharacterEncoding("utf-8");
		String encType = "utf-8"; // 인코딩 정보
		int maxSize = 1*1024*1024; // 최대 업로드될 파일 크기
		MultipartRequest imageUp = null;
		
		String savePath = request.getServletContext().getRealPath("/img"); // 저장경로
//		System.out.println(savePath); // 저장경로 확인
		imageUp = new MultipartRequest(request, savePath, maxSize, encType, new DefaultFileRenamePolicy()); // 파일 업로드 하는 객체 생성
		Enumeration<?> files = imageUp.getFileNames(); // input타입이 file인 파라미터를 불러옴
		
		String image = imageUp.getFilesystemName("image");  // 서버에 저장될 파일이름
		
		String pj_name = imageUp.getParameter("pj_name");
//		String image = request.getParameter("image");
		//Date upload_date = (new Date(System.currentTimeMillis()));
		
		int total_price = 0;
//		Date deadline = (new Date(System.currentTimeMillis()));
//		Date sche_date = (new Date(System.currentTimeMillis()));
		
		String pj_story = imageUp.getParameter("pj_story");
		String refund = imageUp.getParameter("refund");
		String bank = imageUp.getParameter("bank");
		String account_name = imageUp.getParameter("account_name");
		int account = Integer.parseInt(imageUp.getParameter("account"));
		String id = imageUp.getParameter("id");
		int field_num = Integer.parseInt(imageUp.getParameter("field_num"));
		int target = Integer.parseInt(imageUp.getParameter("target"));
		boolean result=dao.insertProject(pj_name, image, target, total_price, pj_story, refund, bank, account_name, account, id, field_num);
		
		ProjectPlusVO spon = dao.selectId(id);
		request.setAttribute("spon", spon);
		
		String[] gp = imageUp.getParameterValues("goods_price");
		String[] gn = imageUp.getParameterValues("goods_name");
		String[] st = imageUp.getParameterValues("store");
		int pj_num = spon.getPj_num();
		
		if(result == true && gp.length < 2 && gn.length < 2 && st.length < 2){
			boolean result1=dao.insertProject2(gp[0], gn[0], st[0], pj_num);
			return "artispick?cmd=main";
		} else if(result == true && gp.length < 3 && gn.length < 3 && st.length < 3) {
			boolean result1=dao.insertProject2(gp[0], gn[0], st[0], pj_num);
			boolean result2=dao.insertProject2(gp[1], gn[1], st[1], pj_num);
			return "artispick?cmd=main";
		} else if(result == true && gp.length < 4 && gn.length < 4 && st.length < 4) {
			boolean result1=dao.insertProject2(gp[0], gn[0], st[0], pj_num);
			boolean result2=dao.insertProject2(gp[1], gn[1], st[1], pj_num);
			boolean result3=dao.insertProject2(gp[2], gn[2], st[2], pj_num);
			return "artispick?cmd=main";
		} else if(result == true && gp.length < 5 && gn.length < 5 && st.length < 5) {
			boolean result1=dao.insertProject2(gp[0], gn[0], st[0], pj_num);
			boolean result2=dao.insertProject2(gp[1], gn[1], st[1], pj_num);
			boolean result3=dao.insertProject2(gp[2], gn[2], st[2], pj_num);
			boolean result4=dao.insertProject2(gp[3], gn[3], st[3], pj_num);
			return "artispick?cmd=main";
		} else if(result == true && gp.length < 6 && gn.length < 6 && st.length < 6) {
			boolean result1=dao.insertProject2(gp[0], gn[0], st[0], pj_num);
			boolean result2=dao.insertProject2(gp[1], gn[1], st[1], pj_num);
			boolean result3=dao.insertProject2(gp[2], gn[2], st[2], pj_num);
			boolean result4=dao.insertProject2(gp[3], gn[3], st[3], pj_num);
			boolean result5=dao.insertProject2(gp[4], gn[4], st[4], pj_num);
			return "artispick?cmd=main";
		} else if(result == true && gp.length < 7 && gn.length < 7 && st.length < 7) {
			boolean result1=dao.insertProject2(gp[0], gn[0], st[0], pj_num);
			boolean result2=dao.insertProject2(gp[1], gn[1], st[1], pj_num);
			boolean result3=dao.insertProject2(gp[2], gn[2], st[2], pj_num);
			boolean result4=dao.insertProject2(gp[3], gn[3], st[3], pj_num);
			boolean result5=dao.insertProject2(gp[4], gn[4], st[4], pj_num);
			boolean result6=dao.insertProject2(gp[5], gn[5], st[5], pj_num);
			return "artispick?cmd=main";
		} else if(result == true && gp.length < 8 && gn.length < 8 && st.length < 8) {
			boolean result1=dao.insertProject2(gp[0], gn[0], st[0], pj_num);
			boolean result2=dao.insertProject2(gp[1], gn[1], st[1], pj_num);
			boolean result3=dao.insertProject2(gp[2], gn[2], st[2], pj_num);
			boolean result4=dao.insertProject2(gp[3], gn[3], st[3], pj_num);
			boolean result5=dao.insertProject2(gp[4], gn[4], st[4], pj_num);
			boolean result6=dao.insertProject2(gp[5], gn[5], st[5], pj_num);
			boolean result7=dao.insertProject2(gp[6], gn[6], st[6], pj_num);
			return "artispick?cmd=main";
		} else if(result == true && gp.length < 9 && gn.length < 9 && st.length < 9) {
			boolean result1=dao.insertProject2(gp[0], gn[0], st[0], pj_num);
			boolean result2=dao.insertProject2(gp[1], gn[1], st[1], pj_num);
			boolean result3=dao.insertProject2(gp[2], gn[2], st[2], pj_num);
			boolean result4=dao.insertProject2(gp[3], gn[3], st[3], pj_num);
			boolean result5=dao.insertProject2(gp[4], gn[4], st[4], pj_num);
			boolean result6=dao.insertProject2(gp[5], gn[5], st[5], pj_num);
			boolean result7=dao.insertProject2(gp[6], gn[6], st[6], pj_num);
			boolean result8=dao.insertProject2(gp[7], gn[7], st[7], pj_num);
			return "artispick?cmd=main";
		} else if(result == true && gp.length < 10 && gn.length < 10 && st.length < 10) {
			boolean result1=dao.insertProject2(gp[0], gn[0], st[0], pj_num);
			boolean result2=dao.insertProject2(gp[1], gn[1], st[1], pj_num);
			boolean result3=dao.insertProject2(gp[2], gn[2], st[2], pj_num);
			boolean result4=dao.insertProject2(gp[3], gn[3], st[3], pj_num);
			boolean result5=dao.insertProject2(gp[4], gn[4], st[4], pj_num);
			boolean result6=dao.insertProject2(gp[5], gn[5], st[5], pj_num);
			boolean result7=dao.insertProject2(gp[6], gn[6], st[6], pj_num);
			boolean result8=dao.insertProject2(gp[7], gn[7], st[7], pj_num);
			boolean result9=dao.insertProject2(gp[8], gn[8], st[8], pj_num);
			return "artispick?cmd=main";
		} else if(result == true && gp.length < 11 && gn.length < 11 && st.length < 11) {
			boolean result1=dao.insertProject2(gp[0], gn[0], st[0], pj_num);
			boolean result2=dao.insertProject2(gp[1], gn[1], st[1], pj_num);
			boolean result3=dao.insertProject2(gp[2], gn[2], st[2], pj_num);
			boolean result4=dao.insertProject2(gp[3], gn[3], st[3], pj_num);
			boolean result5=dao.insertProject2(gp[4], gn[4], st[4], pj_num);
			boolean result6=dao.insertProject2(gp[5], gn[5], st[5], pj_num);
			boolean result7=dao.insertProject2(gp[6], gn[6], st[6], pj_num);
			boolean result8=dao.insertProject2(gp[7], gn[7], st[7], pj_num);
			boolean result9=dao.insertProject2(gp[8], gn[8], st[8], pj_num);
			boolean result10=dao.insertProject2(gp[9], gn[9], st[9], pj_num);
			return "artispick?cmd=main";
		} else {
			return "pjpost.jsp";
		}
		
	}
	
	
	/**공지사항*/
	private String getDetailNotice(HttpServletRequest request) {
		AdminDetailDAO dao = new AdminDetailDAO();
		int noticeNum = Integer.parseInt(request.getParameter("noticeNum"));
		AdminDetailVO detail = dao.getDetailNotice(noticeNum);
		boolean result=dao.updateView(noticeNum);

		request.setAttribute("detail", detail);
		return "noticedetail.jsp";  //상세보기 페이지 이동
	}
	
	/**프로젝트 구매*/
	private String buyAction(HttpServletRequest request) throws ServletException, IOException {
		ProjectBuyDAO dao = new ProjectBuyDAO();
		
		String addr = request.getParameter("addr");
		Date perform_date = (new Date(System.currentTimeMillis()));
		String status = request.getParameter("status");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		int so_amount = Integer.parseInt(request.getParameter("so_amount"));
		Date order_date = (new Date(System.currentTimeMillis()));
		int so_price = Integer.parseInt(request.getParameter("so_price"));
		int sponsor_order_num = Integer.parseInt(request.getParameter("sponsor_order_num"));
		int pj_goods_num = Integer.parseInt(request.getParameter("pj_goods_num"));
		
		boolean result=dao.buyProject(addr, perform_date, status, name, id, so_amount, order_date, so_price, sponsor_order_num, pj_goods_num);
		if(result == true)
			return "payfin.jsp";
		return "address.jsp";
		
	}
	
	/**후원품 나타냄 credit*/
	private String geetselectsponnn(HttpServletRequest request){
		PayDAO pay = new PayDAO(); 
		int pj_num = Integer.parseInt(request.getParameter("pj_num"));
		
		PayVO asdf = pay.selectsponn(pj_num);
		request.setAttribute("asdf", asdf);
		
		return "payfin2.jsp";
	}
	
	
	/**후원품 나타냄 credit*/
	private String geetselectspon(HttpServletRequest request){
		PayDAO pay = new PayDAO(); 
		int pj_num = Integer.parseInt(request.getParameter("pj_num"));
		
		PayVO asdf = pay.selectsponn(pj_num);
		request.setAttribute("asdf", asdf);
		
		return "credit2.jsp";
	}
	
	/**후원품 나타냄 bank*/
	private String geeetselectspon(HttpServletRequest request){
		PayDAO pay = new PayDAO(); 
		int pj_num = Integer.parseInt(request.getParameter("pj_num"));
		
		PayVO asdf = pay.selectsponn(pj_num);
		request.setAttribute("asdf", asdf);
		
		return "bank2.jsp";
	}
	
	
	/**후원품 나타냄 credit*/
	private String getselectspon(HttpServletRequest request) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		PayDAO dao = new PayDAO();
		int pj_num = Integer.parseInt(request.getParameter("pj_num"));
		int pj_goods_num = Integer.parseInt(request.getParameter("pj_goods_num"));
		
		PayVO asdf = dao.selectspon(pj_num, pj_goods_num);
		request.setAttribute("asdf", asdf);
		
		return "credit.jsp";
	}
	
	/**후원품 나타냄 address에서 주소 보내기*/
	private String getselectsponsss(HttpServletRequest request) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		
		PayDAO dao = new PayDAO();
		int pj_num = Integer.parseInt(request.getParameter("pj_num"));
		int pj_goods_num = Integer.parseInt(request.getParameter("pj_goods_num"));
		
		PayVO asdf = dao.selectspon(pj_num, pj_goods_num);
		request.setAttribute("asdf", asdf);
		
		return "address.jsp";
	}
	
	/**후원품 나타냄 address*/
	private String getselectsponss(HttpServletRequest request) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		
		PayDAO dao = new PayDAO();
		int pj_num = Integer.parseInt(request.getParameter("pj_num"));
		int pj_goods_num = Integer.parseInt(request.getParameter("pj_goods_num"));
		
		PayVO asdf = dao.selectspon(pj_num, pj_goods_num);
		request.setAttribute("asdf", asdf);
		
		return "address.jsp";
	}
	
	/**후원품 나타냄 address에서 주소 보내기*/
	private String getselectsponssss(HttpServletRequest request) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		
		PayDAO dao = new PayDAO();
		
		int pj_num = Integer.parseInt(request.getParameter("pj_num"));
		int pj_goods_num = Integer.parseInt(request.getParameter("pj_goods_num"));
		
		PayVO qwer = dao.selectspon(pj_num, pj_goods_num);
		request.setAttribute("qwer", qwer);
		
		String addr = request.getParameter("addr");
		String name = request.getParameter("name");
		String addr1 = request.getParameter("addr1");
		int postcode = Integer.parseInt(request.getParameter("postcode"));
		
		String id = request.getParameter("id");
		
		boolean result=dao.insertaddress(addr, name, id, addr1, postcode);
		
		PayVO spon = dao.select();
		request.setAttribute("spon", spon);
		
		int sponsor_order_num = spon.getSponsor_order_num();
		int so_price = qwer.getSo_price();
		
		boolean result1=dao.updatespon(sponsor_order_num, so_price);
		
		PayVO asdf = dao.selectspons(pj_num, pj_goods_num);
		request.setAttribute("asdf", asdf);
		
		int sponsor_order_detail_num = qwer.getSponsor_order_detail_num();
		dao.updateProjectStore(sponsor_order_detail_num);
		
		if(result == true && result1 == true)
			return "payfin.jsp";
		return "address.jsp";
	}
	
	
	
	/**후원품 나타냄 bank*/
	private String getselectspons(HttpServletRequest request) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		PayDAO dao = new PayDAO();
		int pj_num = Integer.parseInt(request.getParameter("pj_num"));
		int pj_goods_num = Integer.parseInt(request.getParameter("pj_goods_num"));
		
		PayVO asdf = dao.selectspon(pj_num, pj_goods_num);
		request.setAttribute("asdf", asdf);
		
		return "bank.jsp";
	}
	
	/**프로젝트 상세*/
	private String getDetailProject(HttpServletRequest request) {
		ProjectDAO doo = new ProjectDAO();
		ProjectDetailDAO dao = new ProjectDetailDAO();
		ProjectDetailInDAO pao = new ProjectDetailInDAO();
		int pjNum = Integer.parseInt(request.getParameter("pjNum"));
		
		ArrayList<ProjectDetailInVO> list = pao.getDetailProjectIn(pjNum);
		ProjectDetailVO detaill = dao.getDetailProject(pjNum);
		ProjectDetailVO detailll = dao.getDetailProjectPlus(pjNum);
		
		request.setAttribute("spongoods", list);
		request.setAttribute("detaill", detaill);
		request.setAttribute("detailll", detailll);
		boolean result = dao.updateProjectTotal();
		boolean result1 = pao.updateProjectSpon();
		return "pjdetail.jsp";
	}
	
	/**프로젝트 상세*/
	private String getDetailProjectt(HttpServletRequest request) {
		ProjectDAO doo = new ProjectDAO();
		ProjectDetailDAO dao = new ProjectDetailDAO();
		ProjectDetailInDAO pao = new ProjectDetailInDAO();
		int pjNum = Integer.parseInt(request.getParameter("pjNum"));
		
		ArrayList<ProjectDetailInVO> list = pao.getDetailProjectIn(pjNum);
		ProjectDetailVO detaill = dao.getDetailProject(pjNum);
		ProjectDetailVO detailll = dao.getDetailProjectPlus(pjNum);
		
		request.setAttribute("spongoods", list);
		request.setAttribute("detaill", detaill);
		request.setAttribute("detailll", detailll);
		boolean result = dao.updateProjectTotal();
		boolean result1 = pao.updateProjectSpon();
		return "pjdetail.jsp";
	}
	

	
	
	
	
	
	
	
	/**후원품 구매하기2*/
	private String getsponsListt(HttpServletRequest request) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		
		PayDAO dao = new PayDAO();
		int pj_num = Integer.parseInt(request.getParameter("pj_num"));
		int pj_goods_num = Integer.parseInt(request.getParameter("pj_goods_num"));
		PayVO spon = dao.selectnum(pj_num, pj_goods_num);
		request.setAttribute("spon", spon);
		
		PayDAO pay = new PayDAO();
		int so_amount = Integer.parseInt(request.getParameter("so_amount"));
		int so_price = spon.getGoods_price();       
		
		boolean result=pay.insertspongoods(so_amount, so_price, pj_goods_num);
		
		PayVO asdf = dao.selectspon(pj_num, pj_goods_num);
		request.setAttribute("asdf", asdf);
		
		ProjectDetailDAO pp = new ProjectDetailDAO();
		boolean result2 = pp.updateProjectTotal();
		
		if(result == true)
			return "payment.jsp";
		return "spongoods.jsp";
	}
	
	
	/**후원품 구매하기*/
	private String getsponsList(HttpServletRequest request) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		
		PayDAO dao = new PayDAO();
		int pj_num = Integer.parseInt(request.getParameter("pj_num"));
		int pj_goods_num = Integer.parseInt(request.getParameter("pj_goods_num"));
		PayVO spon = dao.selectnum(pj_num, pj_goods_num);
		request.setAttribute("spon", spon);
		
		PayDAO pay = new PayDAO();
		int so_amount = Integer.parseInt(request.getParameter("so_amount"));
		int so_price = spon.getGoods_price();       
		
		boolean result=pay.insertspongoods(so_amount, so_price, pj_goods_num);
		
		PayVO asdf = dao.selectspon(pj_num, pj_goods_num);
		request.setAttribute("asdf", asdf);
		
		ProjectDetailDAO pp = new ProjectDetailDAO();
		boolean result2 = pp.updateProjectTotal();
		
		if(result == true)
			return "payment.jsp";
		return "spongoods.jsp";
	}
	
	/**후원품 구매하기*/
	private String ggetsponsList(HttpServletRequest request) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		
		PayDAO pay = new PayDAO();
		int spon_price = Integer.parseInt(request.getParameter("spon_price"));
		String id = request.getParameter("id");    
		int pj_num = Integer.parseInt(request.getParameter("pj_num"));
		
		boolean result=pay.insertspongoodss(spon_price, id, pj_num);
		
		PayVO asdf = pay.selectsponn(pj_num);
		request.setAttribute("asdf", asdf);
		
		ProjectDetailDAO pp = new ProjectDetailDAO();
		boolean result2 = pp.updateProjectTotal();
		
		if(result == true)
			return "payment2.jsp";
		return "spongoods.jsp";
	}
	
	/**구매 상세*/
	private String getsponList(HttpServletRequest request) {
		ProjectDetailDAO dao = new ProjectDetailDAO();
		ProjectDetailInDAO pao = new ProjectDetailInDAO();
		
		int pjNum = Integer.parseInt(request.getParameter("pjNum"));
		int pj_goods_num = Integer.parseInt(request.getParameter("pj_goods_num"));
		
		ArrayList<ProjectDetailInVO> list = pao.getDetailProjectInn(pjNum, pj_goods_num);
		ProjectDetailVO detaill = dao.getDetailProject(pjNum);
		
		request.setAttribute("spongoods", list); 
		request.setAttribute("detaill", detaill);
		boolean result = dao.updateProjectTotal();
		
		return "spongoods.jsp";
	}
	
	/**구매 상세*/
	private String getsponListttt(HttpServletRequest request) throws ServletException, IOException{
		
		request.setCharacterEncoding("utf-8");
		
		PayDAO dao = new PayDAO();
		int pj_num = Integer.parseInt(request.getParameter("pj_num"));
		int pj_goods_num = Integer.parseInt(request.getParameter("pj_goods_num"));
		PayVO spon = dao.selectnum(pj_num, pj_goods_num);
		request.setAttribute("spon", spon);
		
		PayDAO pay = new PayDAO();
		int so_amount = Integer.parseInt(request.getParameter("so_amount"));
		int so_price = spon.getGoods_price();       
		
		boolean result=pay.insertspongoods(so_amount, so_price, pj_goods_num);
		
		PayVO asdf = dao.selectspon(pj_num, pj_goods_num);
		request.setAttribute("asdf", asdf);
		
		if(result == true)
			return "payment2.jsp";
		return "spongoods2.jsp";
	}
	
	/**구매 상세*/
	private String getsponListt(HttpServletRequest request) {
		ProjectDAO doo = new ProjectDAO();
		ProjectDetailDAO dao = new ProjectDetailDAO();
		ProjectDetailInDAO pao = new ProjectDetailInDAO();
		int pjNum = Integer.parseInt(request.getParameter("pjNum"));
		
		ArrayList<ProjectDetailInVO> list = pao.getDetailProjectIn(pjNum);
		ProjectDetailVO detaill = dao.getDetailProject(pjNum);
		ProjectDetailVO detailll = dao.getDetailProjectPlus(pjNum);
		
		request.setAttribute("spongoods", list);
		request.setAttribute("detaill", detaill);
		request.setAttribute("detailll", detailll);
		boolean result = dao.updateProjectTotal();
		
		return "spongoods2.jsp";
	}
	
	/**구매하기*/
	private String getsponssList(HttpServletRequest request) {
		ProjectDAO doo = new ProjectDAO();
		ProjectDetailDAO dao = new ProjectDetailDAO();
		ProjectDetailInDAO pao = new ProjectDetailInDAO();
		
		int pjNum = Integer.parseInt(request.getParameter("pjNum"));
		int pj_goods_num = Integer.parseInt(request.getParameter("pj_goods_num"));
		ArrayList<ProjectDetailInVO> list = pao.getDetailProjectInn(pjNum, pj_goods_num);
		ProjectDetailVO detaill = dao.getDetailProject(pjNum);
		ProjectDetailVO detailll = dao.getDetailProjectPlus(pjNum);
		
		request.setAttribute("spongoods", list);
		request.setAttribute("detaill", detaill);
		request.setAttribute("detailll", detailll);
		boolean result2 = dao.updateProjectTotal();
		
		return "spongoods.jsp";
	}
	
	/**회원가입1*/
	public String regiAction(HttpServletRequest request) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String encType = "utf-8"; // 인코딩 정보
		int maxSize = 1*1024*1024; // 최대 업로드될 파일 크기
		MultipartRequest imageUp = null;
		
		String savePath = request.getServletContext().getRealPath("/img"); // 저장경로
//		System.out.println(savePath); // 저장경로 확인
		imageUp = new MultipartRequest(request, savePath, maxSize, encType, new DefaultFileRenamePolicy()); // 파일 업로드 하는 객체 생성
		Enumeration<?> files = imageUp.getFileNames(); // input타입이 file인 파라미터를 불러옴
		
		String artiProfile = imageUp.getFilesystemName("artiProfile");  // 서버에 저장될 파일이름
		
		UserDAO dao = new UserDAO();
	
		String id = imageUp.getParameter("userid");
		String passwd = imageUp.getParameter("user_passwd");
		String userName = imageUp.getParameter("name");
		Date birth=(new Date(System.currentTimeMillis()));
		String phone = imageUp.getParameter("phone");
		String gender = imageUp.getParameter("gender");
		String email = imageUp.getParameter("email");
		int field = Integer.parseInt(imageUp.getParameter("field"));
		
		boolean result=dao.register(id, passwd, userName, birth, phone, gender, email, field);
		
		
		if(result == true)
			return "registerok.jsp";
		return "register.jsp";
		
	}
	
	/**회원가입2*/
	public String regiAction2(HttpServletRequest request) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String encType = "utf-8"; // 인코딩 정보
		int maxSize = 1*1024*1024; // 최대 업로드될 파일 크기
		MultipartRequest imageUp = null;
		
		String savePath = request.getServletContext().getRealPath("/img"); // 저장경로
//		System.out.println(savePath); // 저장경로 확인
		imageUp = new MultipartRequest(request, savePath, maxSize, encType, new DefaultFileRenamePolicy()); // 파일 업로드 하는 객체 생성
		Enumeration<?> files = imageUp.getFileNames(); // input타입이 file인 파라미터를 불러옴
		
		String artiProfile = imageUp.getFilesystemName("artiProfile");  // 서버에 저장될 파일이름
		
		UserDAO dao = new UserDAO();
	
		String id = imageUp.getParameter("userid");
		String passwd = imageUp.getParameter("user_passwd");
		String userName = imageUp.getParameter("name");
		Date birth=(new Date(System.currentTimeMillis()));
		String phone = imageUp.getParameter("phone");
		String gender = imageUp.getParameter("gender");
		String email = imageUp.getParameter("email");
		int field = Integer.parseInt(imageUp.getParameter("field"));
		
		boolean result=dao.register(id, passwd, userName, birth, phone, gender, email, field);
		
		String artiName =imageUp.getParameter("artiName");
		String intro =imageUp.getParameter("intro");
		
		boolean result1=dao.register2(id, artiName, intro, artiProfile);
		
		if(result == true && result1 == true)
			return "registerok.jsp";
		return "register2.jsp";
		
	}
	
	/**프로젝트 마감임박순 정렬*/
	private String fin(HttpServletRequest request) {
		ProjectDAO dao = new ProjectDAO();
		ArrayList<ProjectVO> list = dao.getDeadList();
		request.setAttribute("fin", list);
		return "main.jsp";
	}
	/**프로젝트 업로드순 정렬*/
	private String brandnew(HttpServletRequest request) {
		ProjectDAO dao = new ProjectDAO();
		ArrayList<ProjectVO> list = dao.getNewList();
		request.setAttribute("brandnew", list);
		return "main.jsp";
	}
	/**프로젝트 인기순 정렬*/
	private String pop(HttpServletRequest request) throws ServletException, IOException {
		ProjectDAO dao = new ProjectDAO();
		ArrayList<ProjectVO> list = dao.getPopList();
		request.setAttribute("pop", list);
		return "main.jsp";
	}


//	/**프로젝트 분야 선택*/
//	private String fieldListAction(HttpServletRequest request) throws ServletException, IOException {
//		ProjectDAO dao = new ProjectDAO();
//		String field="발라드";
//		ArrayList<ProjectVO> list = dao.getPjField(field);
//		request.setAttribute("list", list);
//		return "pjlist.jsp";
//	}
	
	/**프로젝트 제목 검색*/ /*안나옴*/
	private String searchListAction(HttpServletRequest request) {
		ProjectDAO dao = new ProjectDAO();
		String pjName="데카당";
		ArrayList<ProjectVO> list = dao.getPjSearch(pjName);
		request.setAttribute("search", list);
		return "searchList.jsp";
	}
	
	/**메신저*/
	private String getQnaList(HttpServletRequest request) throws Exception{
		int page=1;
		int recordsPerPage=5;
		if(request.getParameter("page")!=null)
			page=Integer.parseInt(request.getParameter("page"));
		QnaDAO dao = new QnaDAO();
		String id=request.getParameter("id");
		ArrayList<QnaVO> list = dao.getQnaList((page-1)*recordsPerPage, recordsPerPage,id);
		int noOfRecords=dao.getNoOfRecords();
		int noOfPages=(int)Math.ceil(noOfRecords*1.0 / recordsPerPage);
		request.setAttribute("qnalist", list);
		request.setAttribute("noOfPages", noOfPages);
		request.setAttribute("currentPage", page);
		return "message.jsp";
		}
	
	/**프로젝트목록
	 * @throws Exception */
	private String list(HttpServletRequest request) throws Exception {
		int page=1;
		int recordsPerPage =12;
		if(request.getParameter("page")!=null)
			page = Integer.parseInt(request.getParameter("page"));
		ProjectDAO dao = new ProjectDAO();
		ArrayList<ProjectVO> list = dao.getPjList((page-1)*recordsPerPage, recordsPerPage);
		int noOfRecords = dao.getNoOfRecords();
		int noOfPages=(int)Math.ceil(noOfRecords*1.0 / recordsPerPage);
//		boolean result = dao.updateProjectTotal();
		int count=0;
		count = dao.projectCount();
		request.setAttribute("count", count);
		request.setAttribute("list", list);
		request.setAttribute("noOfPages", noOfPages);
		request.setAttribute("currentPage", page);
		return "pjlist.jsp";
	}
	
	/**최다후원순
	 * @throws Exception */
	private String maxspon(HttpServletRequest request) throws Exception {
			int page=1;
			int recordsPerPage =12;
			if(request.getParameter("page")!=null)
				page = Integer.parseInt(request.getParameter("page"));
			ProjectDAO dao = new ProjectDAO();
			ArrayList<ProjectVO> list = dao.getsponList((page-1)*recordsPerPage, recordsPerPage);
			int noOfRecords = dao.getNoOfRecords();
			int noOfPages=(int)Math.ceil(noOfRecords*1.0 / recordsPerPage);
			request.setAttribute("maxspon", list); // request는 response전에 사용되는 임시메모리
			request.setAttribute("noOfPages", noOfPages);
			request.setAttribute("currentPage", page);
			return "maxspon.jsp";
		}
	
	/**인기순*/
	private String popList(HttpServletRequest request) {
			int page=1;
			int recordsPerPage=12;
			if(request.getParameter("page")!=null)
				page=Integer.parseInt(request.getParameter("page"));
			ProjectDAO dao = new ProjectDAO();
			ArrayList<ProjectVO> list = dao.popList((page-1)*recordsPerPage, recordsPerPage);
			int noOfRecords=dao.getNoOfRecords();
			int noOfPages=(int)Math.ceil(noOfRecords*1.0 / recordsPerPage);
			request.setAttribute("popList", list);
			request.setAttribute("noOfPages", noOfPages);
			request.setAttribute("currentPage", page);
			return "popList.jsp";
		}

	/**마감임박순*/
	private String endList(HttpServletRequest request) {
			int page=1;
			int recordsPerPage=12;
			if(request.getParameter("page")!=null)
				page=Integer.parseInt(request.getParameter("page"));
			ProjectDAO dao = new ProjectDAO();
			ArrayList<ProjectVO> list = dao.endList((page-1)*recordsPerPage, recordsPerPage);
			int noOfRecords=dao.getNoOfRecords();
			int noOfPages=(int)Math.ceil(noOfRecords*1.0 / recordsPerPage);
			request.setAttribute("endList", list);
			request.setAttribute("noOfPages", noOfPages);
			request.setAttribute("currentPage", page);
			return "endList.jsp";
		}
	
	/**공지사항 리스트*/
	private String noti(HttpServletRequest request) {
		int page=1;
		int recordsPerPage =10;
		if(request.getParameter("page")!=null)
			page = Integer.parseInt(request.getParameter("page"));
		AdminDAO dao = new AdminDAO();
		ArrayList<AdminVO> list = dao.notice((page-1)*recordsPerPage, recordsPerPage);
		int noOfRecords = dao.getNoOfRecords();
		int noOfPages=(int)Math.ceil(noOfRecords*1.0 / recordsPerPage);
		
		request.setAttribute("noti", list);
		request.setAttribute("noOfPages", noOfPages);
		request.setAttribute("currentPage", page);
		return "notice.jsp";
	}




	
	
	/*************************************************************************/
	
	/**샵 목록*/
	private String getgoodslist(HttpServletRequest request) {
		ShopDAO dao = new ShopDAO();
		ArrayList<ShopVO> list = dao.getShopList();
		request.setAttribute("list", list);
		return "shoplist.jsp";
	}
	
	/**샵 상세 목록*/
	private String shopdetailSelect(HttpServletRequest request) {
		ShopDAO dao = new ShopDAO();
		int shop_num = Integer.parseInt(request.getParameter("shop_num"));
		ShopVO detail = dao.selectshopdetail(shop_num);
		request.setAttribute("detail", detail);
		return "shopdetail.jsp";
	}
	
	/**샵 상세 목록*/
	private String shopdetailSelectgoods(HttpServletRequest request) {
		ShopDAO dao = new ShopDAO();
		int shop_num = Integer.parseInt(request.getParameter("shop_num"));
		ShopVO detail = dao.selectshopdetail(shop_num);
		request.setAttribute("detail", detail);
		
		String id = request.getParameter("id");
		UserDAO uao = new UserDAO();
		UserVO vo = uao.getUser(id);
		request.setAttribute("vo", vo);
		
		return "shopbuy.jsp";
	}
	
	/**샵 주문내역*/
	private String shoporderSelect(HttpServletRequest request) {
		ShopDAO dao = new ShopDAO();
		String id = request.getParameter("id");
		ArrayList<ShopVO> detail = dao.selectshoporder(id);
		request.setAttribute("detail", detail);
		return "myorder.jsp";
	}
	
	/**샵 주문하기*/
	private String shoporderInsert(HttpServletRequest request) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		ShopDAO dao = new ShopDAO();
		
		String id = request.getParameter("id");
		ArrayList<ShopVO> detail = dao.selectshoporder(id);
		request.setAttribute("detail", detail);
		
		UserDAO uao = new UserDAO();
		
		UserVO vo = uao.getUser(id);
		request.setAttribute("vo", vo);
	
		String addr = request.getParameter("addr");
		String addr1 = request.getParameter("addr1");
		int postcode = Integer.parseInt(request.getParameter("postcode"));
		int shop_num = Integer.parseInt(request.getParameter("shop_num"));
		String name = request.getParameter("name");
		
		boolean result=dao.insertshopgoods(addr, addr1, postcode, shop_num, name);
		
		ShopVO spon = dao.select();
		request.setAttribute("spon", spon);
		
		int amount = Integer.parseInt(request.getParameter("amount"));
		int price = Integer.parseInt(request.getParameter("price"));
		int shop_order_detail_num = spon.getShop_order_detail_num();
		
		boolean result1=dao.insertshopgoods2(amount, price, shop_order_detail_num, id);
		
		dao.updateProjectStore(shop_order_detail_num);
		
		
		
		if(result == true && result1 == true)
			return "myorder.jsp";
		return "register.jsp";
	}
	
	private String calculate(HttpServletRequest request) {
		ShopDAO dao = new ShopDAO();
		
		String id = request.getParameter("id");
		ArrayList<ShopVO> detail = dao.calculate(id);
		request.setAttribute("detail", detail);
		
		return "myproject.jsp";
	}
	
	/**사용자 장바구니 담기*/
	private String Shopcart(HttpServletRequest request) throws Exception {
			ShopCartDAO dao = new ShopCartDAO();
			String id=request.getParameter("id");
			ArrayList<ShopCartVO> vo = dao.getCart(id);
			request.setAttribute("list", vo);
			return "artispick?cmd=shopcart";
		}
	
	/**사용자 장바구니 목록 가져오기*/
	private String getShopcart(HttpServletRequest request) throws Exception {
			ShopCartDAO dao = new ShopCartDAO();
			String id=request.getParameter("id");
			ArrayList<ShopCartVO> vo = dao.getCart(id);
			request.setAttribute("list", vo);
			return "artispick?cmd=shopcart";
		}
	
}
