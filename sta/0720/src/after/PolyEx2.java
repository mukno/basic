package after;

public class PolyEx2 {
	
	public static void main(String[] args) {
		
	//�θ� Ÿ��=new �ڽ�()
	//�θ� Ÿ������ ����� ������ ������ �� �ִ� ������
	//�θ� Ÿ���� ������ �̴� �ɹ� ������ �޼ҵ�� ���ѵ�
	//��,�������̵��� ��� �ִٸ� �ڽ� �޼ҵ尡 �����.
		
		Parent p1=new Child();
		
		System.out.println(p1.x);
		p1.method();
		Child c1=(Child) p1;
		System.out.println(c1.y);
		c1.method2();
		
		//java.lang.ClassCastException
		Child c2=(Child)new Parent();
		
		
		
		
	}

}
