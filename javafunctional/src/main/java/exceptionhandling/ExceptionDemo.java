package exceptionhandling;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		int i,j,k=0;
		i = 8;
		j = 0;
		try {
			k = i/j;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println(k);
	}

}
