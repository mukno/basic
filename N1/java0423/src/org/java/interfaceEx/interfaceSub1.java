package org.java.interfaceEx;

public interface interfaceSub1 {
	
	public static final String PROJECTNAME="23523";
	
	public static void getConnection() {
		System.out.println("Ŭ���� �޼���");
	}
	
	public abstract void excuteQuery();
	public default void defaultMethod() {
		System.out.println("default�ż���");
	}
	
	
	
	
	
	
	}
	
	

