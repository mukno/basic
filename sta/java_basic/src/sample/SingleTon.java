package sample;

public class SingleTon {
	//디자인패턴 - singleTon 패턴
	//객체를 하나만 ㅏ용한 후 사용
	private SingleTon() {}
	private static SingleTon singleton;
	public static SingleTon getInstance() {
		if(singleton==null) {
			singleton=new SingleTon();
		}
		return singleton;
		
	}

}
