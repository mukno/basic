package org.java.interfaceEx;

public interface interfaceMember {

	public static final int NUMMAX=1000;
	public static final int NUMMIN=1;
	
	int NUMMAX2=2000;
	int NUMMIN2=1;
	
	//public int num;//일반 맴버(인스턴스 맴버)X
	
	//public static final 생략가능
	public abstract void excuteInsert();
	public abstract void excute();
	void excuteDelete();
	void excuteSelect();
	
	
	
}
