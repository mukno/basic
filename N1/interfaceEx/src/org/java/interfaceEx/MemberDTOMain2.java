package org.java.interfaceEx;

import java.util.Scanner;

import org.java.MemberDTO.MemberDTO;

public class MemberDTOMain2 {

	public static void main(String[] args) {
		MemberDTO member1=new MemberDTO("m1", "1111", "s1", 22);

		
		//ScannerŬ���� �̿��ؼ� �������� insert�� ȸ�� ���� ����
		//ScannerŬ���� �̿��ؼ� �������� update�� ȸ�� ���� ����
		//ScannerŬ���� �̿��ؼ� �������� delete�� ȸ�� ���� ����
		//ScannerŬ���� �̿��ؼ� �������� select�� ȸ�� ��ȸ ����
		//while���̿��ؼ� exit�� �ԷµǸ� ����
		Scanner a=new Scanner(System.in);
		
		boolean bool=false;
		//while��>>DB�� �����͸� get�� �� ���
		while(!bool) {
			System.out.println("������ �Է�: ");
			String query=a.next();
			
			if(query.equals("insert")){
				System.out.println("ȸ������");

				System.out.println("���̵�: "+member1.getUserID());
				System.out.println("��й�ȣ: "+member1.getUserPW());
				System.out.println("�̸�: "+member1.getUserNAME());
				System.out.println("����: "+member1.getUserAGE());
			}else if(query.equals("update")) {

				System.out.println("���̵�: "+member1.getUserID());
				System.out.println("��й�ȣ: "+member1.getUserPW());
				System.out.println("�̸�: "+member1.getUserNAME());
				System.out.println("����: "+member1.getUserAGE());
				System.out.println("ȸ������");
			}else if(query.equals("delete")) {
				System.out.println("ȸ������");
			}else if(query.equals("select")) {
				System.out.println("ȸ����ȸ");
			}else if(query.equals("exit")) {
				System.out.println("�����մϴ�.");
				bool=true;
			}else
				System.out.println("������ �Է� ����... �������� �ٽ��Է��ϼ���.");
		}
		
	}

}
