package org.java.javaBasic;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer strb=new StringBuffer("���ڿ�");
		String str="���ڿ�";

		//String�� �����Ұ� replace (�ڸ����ϰ�,����)
		System.out.println(str.replace("��", "111"));
		System.out.println(str);
		
		//StringBuffer ��������
		//append�޼��� �ڷ� �߰� (������ ��)
		System.out.println(strb);
		strb.append("��");
		System.out.println(strb);
		strb.append("���߰�");
		System.out.println(strb);

		//insert �޼��� Ư�� ��� ������ �߰� (offset,) : ��ġ
		strb.insert(4, "4������ �߰�");
		System.out.println(strb);//Ư�� ��ġ��� �߰�
		
		//replace (������,������ �����,������� ����)
		strb.replace(0,4,"���湮�ڿ�");
		System.out.println(strb);
		
		//delete ���ڿ��� ����
		strb.delete(0, 4);
		System.out.println(strb);
		
		//reverse ���ڿ� ���� ����
		strb.reverse();
		System.out.println(strb);
		
		
		


		
		
		
	}

}
