package member.action;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.domain.MemberVO;
import member.persistence.MemberDAO;

import static member.persistence.JDBCUtil.*;

import java.sql.Connection;

public class LoginAction implements Action{

	private String path;
	
	public LoginAction(String path) {
	
		this.path=path;//view/LoginForm.jsp
	}
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//비지니스 로직 작성
		//loginForm.jsp 에서 값 가져오기
		String password=req.getParameter("password");
		String userid=req.getParameter("userid");
		
		//DB작업
		Connection con=getConnection();
		MemberDAO dao=new MemberDAO(con);
		//vo가 null이 아니면
		//세션에 값을 담은 후 이동
		
		MemberVO vo=dao.isLogin(userid, password);
		if(vo!=null) {
			HttpSession session=req.getSession();
			session.setAttribute("loginVO",vo);
			
			
		}
		close(con);
		//vo가 null이면
		//이전페이지로 돌아가기
		
		
		
		
		//PATH : 사용자에게 보여줄 페이지
		//redirect: t(sendRedirect),f(forward)
		return new ActionForward(path, true);
	}	

}
