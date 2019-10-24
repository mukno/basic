package shop;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop{

	ArrayList<User> users=new ArrayList<User>();
	ArrayList<Product> products=new ArrayList<Product>();
	ArrayList<Product> cart=new ArrayList<Product>();
	
	private Scanner scan;
	private int selUser;
	private String title;
	Scanner sc=new Scanner(System.in);
	
	public void productList() {
		
	}
	public void checkout(){
		
	}
	
	@Override
	public void setTitle(String title) {

		this.title=title;
		
	}

	@Override
	public void genUser() {
		
		//users에 User객체 생성후 담기
		users.add(new User("김태욱",payType.CARD));
		users.add(new User("홍길동",payType.CASH));
		
		
	}

	@Override
	public void genProduct() {
		// TODO Auto-generated method stub
		products.add(new CellPhone("갤럭시", 111111, "s"));
		products.add(new CellPhone("아이폰", 22222, "k"));
		products.add(new SmartTV("삼성 3d",33333, "4"));
		products.add(new SmartTV("lg 3d", 4444, "f"));
		
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(title+": 메인 화면 -계정 선택");
		System.out.println("========================");
		int i =0;
		for(User user:users) {
			
			System.out.printf("[%d]%s(%s)\n",i++,user.getName(),user.getPayType());
		}
		System.out.println("[x]종료 ");
		System.out.print("선택: ");
		String selNo=sc.nextLine().trim();
		System.out.println("## "+selNo+" ## 선택");
		
		
		
		switch(selNo) {
		case "x":
			System.exit(0);
			break;
		case "0": case "1":
			//사용자가 선택한 user 정보를 checkout()에서
			//사용하기 위해 맴버 변수에 담기
			selUser=Integer.parseInt(selNo);
			productlist();
			break;
		
			default:
				System.out.println("입력값 확인");
			break;
		
		}
	}//start종료
	
	//제품 목록 출력
	public void productlist() {
		System.out.println(title+": 상품 목록 -상품 선택");
		System.out.println("========================");
		int i =0;
		for(Product pr:products) {
			System.out.printf("[%d]",i++);
			pr.printDetail();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택: ");
		String selNo=sc.nextLine().trim();
		//selNo:h start(),제품번호를 선택하면
		//cart(장바구니)에 사용자가 선택한 제품을 담고
		//두번째 제품을 선택할 수 있도록 productlist()실행
		switch (selNo) {
		case "h":
			start();
			break;
		case "c":
			
			break;

		default://0~3선택하면
			cart.add(products.get(Integer.parseInt(selNo)));
			productlist();
			break;
		}
		
	}//productlist종료
	
	public void checkOut() {
		
		//selUser변수에 선택된 사용자정보가 있기 때문에
		//그 값을 이용하여 사용자의 결제 바익 출력
		//장바구니에 담아놓은 제품 출력
		System.out.println(title+": 체크아웃");
		System.out.println("========================");
		int i=0,total=0;
		
			for(Product ca:cart) {
				
			System.out.printf("[%d]%s (%d)\n",i++,ca.pname,ca.price);
			total+=ca.price;
		
		}
			System.out.println("========================");
			System.out.println("결제방법: "+users.get(selUser).getPayType());
			System.out.println("합계: "+total+"원 입니다.");
			System.out.println("[p]이전, [q]결제완료");
			System.out.println("선택: ");
			String selNo=sc.nextLine().trim();
			//selNo가 p이면 제품목록 출력 메소드 호출
			//q이면 ##결제가 완료되었습니다. 종료합니다##
			//메세지 보여주고 ㅍ로그램 종료
			switch (selNo) {
			case "p":
				
				productlist();
				break;
			case "q":
				System.out.println("## 결제가 완료되었습니다. 종료합니다 ##");
				System.exit(0);
				break;

			default:
				break;
			}
			
			
			
		
	}


	
	
	

}
