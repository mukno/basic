package after;

public class PolyEx {
	
	public static void main(String[] args) {
		
		Feline feline=new Feline();
		
		
		feline.method1();
		feline.method2();
		
		Canine canine=new Canine();
		
		canine.method1();
		canine.method2();
		canine.method3();
		
		Lion lion=new Lion();
		Dog dog=new Dog();
		
		Animal2 ani1=feline;
		
		ani1.method1();
		ani1.method2();
		
		Animal2 ani2=canine;
		
		ani2.method1();
		ani2.method2();
		Animal2 ani3=lion;
		Animal2 ani4=dog;
		
		
		
	}

}
