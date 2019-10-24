package java0509;

public class DBEx {
	
	public static void main(String[] args) {
		
		try {
			DBConnector.getConnection();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("³¡");
		
	}

}
