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
		
		//users�� User��ü ������ ���
		users.add(new User("���¿�",payType.CARD));
		users.add(new User("ȫ�浿",payType.CASH));
		
		
	}

	@Override
	public void genProduct() {
		// TODO Auto-generated method stub
		products.add(new CellPhone("������", 111111, "s"));
		products.add(new CellPhone("������", 22222, "k"));
		products.add(new SmartTV("�Ｚ 3d",33333, "4"));
		products.add(new SmartTV("lg 3d", 4444, "f"));
		
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(title+": ���� ȭ�� -���� ����");
		System.out.println("========================");
		int i =0;
		for(User user:users) {
			
			System.out.printf("[%d]%s(%s)\n",i++,user.getName(),user.getPayType());
		}
		System.out.println("[x]���� ");
		System.out.print("����: ");
		String selNo=sc.nextLine().trim();
		System.out.println("## "+selNo+" ## ����");
		
		
		
		switch(selNo) {
		case "x":
			System.exit(0);
			break;
		case "0": case "1":
			//����ڰ� ������ user ������ checkout()����
			//����ϱ� ���� �ɹ� ������ ���
			selUser=Integer.parseInt(selNo);
			productlist();
			break;
		
			default:
				System.out.println("�Է°� Ȯ��");
			break;
		
		}
	}//start����
	
	//��ǰ ��� ���
	public void productlist() {
		System.out.println(title+": ��ǰ ��� -��ǰ ����");
		System.out.println("========================");
		int i =0;
		for(Product pr:products) {
			System.out.printf("[%d]",i++);
			pr.printDetail();
		}
		System.out.println("[h] ����ȭ��");
		System.out.println("[c] üũ�ƿ�");
		System.out.print("����: ");
		String selNo=sc.nextLine().trim();
		//selNo:h start(),��ǰ��ȣ�� �����ϸ�
		//cart(��ٱ���)�� ����ڰ� ������ ��ǰ�� ���
		//�ι�° ��ǰ�� ������ �� �ֵ��� productlist()����
		switch (selNo) {
		case "h":
			start();
			break;
		case "c":
			
			break;

		default://0~3�����ϸ�
			cart.add(products.get(Integer.parseInt(selNo)));
			productlist();
			break;
		}
		
	}//productlist����
	
	public void checkOut() {
		
		//selUser������ ���õ� ����������� �ֱ� ������
		//�� ���� �̿��Ͽ� ������� ���� ���� ���
		//��ٱ��Ͽ� ��Ƴ��� ��ǰ ���
		System.out.println(title+": üũ�ƿ�");
		System.out.println("========================");
		int i=0,total=0;
		
			for(Product ca:cart) {
				
			System.out.printf("[%d]%s (%d)\n",i++,ca.pname,ca.price);
			total+=ca.price;
		
		}
			System.out.println("========================");
			System.out.println("�������: "+users.get(selUser).getPayType());
			System.out.println("�հ�: "+total+"�� �Դϴ�.");
			System.out.println("[p]����, [q]�����Ϸ�");
			System.out.println("����: ");
			String selNo=sc.nextLine().trim();
			//selNo�� p�̸� ��ǰ��� ��� �޼ҵ� ȣ��
			//q�̸� ##������ �Ϸ�Ǿ����ϴ�. �����մϴ�##
			//�޼��� �����ְ� ���α׷� ����
			switch (selNo) {
			case "p":
				
				productlist();
				break;
			case "q":
				System.out.println("## ������ �Ϸ�Ǿ����ϴ�. �����մϴ� ##");
				System.exit(0);
				break;

			default:
				break;
			}
			
			
			
		
	}


	
	
	

}
