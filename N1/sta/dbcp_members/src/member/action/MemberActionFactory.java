package member.action;

public class MemberActionFactory {
	private static MemberActionFactory maf;
	
	private MemberActionFactory() {}
	
	public static MemberActionFactory getInstance() {
		if(maf==null)
			maf=new MemberActionFactory();
		return maf;
		
	}
	
	private Action action=null;
	
	//cmd에 의해 알맞은 Action을 생성하고
	//각 Action이 일을 끝낸 후 사용자에게 보여줄 페이지를 세팅하도록 한다.
	
	public Action action(String cmd){
		if(cmd.contentEquals("/login.do")) {
			action=new LoginAction("view/loginForm.jsp");
			
		}
		
		
		return action;
	}
	
}