package org.java.interfaceEx;

public interface interfaceMember {

	public static final int NUMMAX=1000;
	public static final int NUMMIN=1;
	
	int NUMMAX2=2000;
	int NUMMIN2=1;
	
	//public int num;//�Ϲ� �ɹ�(�ν��Ͻ� �ɹ�)X
	
	//public static final ��������
	public abstract void excuteInsert();
	public abstract void excute();
	void excuteDelete();
	void excuteSelect();
	
	
	
}
