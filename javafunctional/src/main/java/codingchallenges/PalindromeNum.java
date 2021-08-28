package codingchallenges;

public class PalindromeNum {
	
	public static void main(String[] args) {
		
		System.out.println(isPalindromeNum(1001));
		
		System.out.println(isPalindromeString("Sarasy"));
		
	}
	
	public static boolean isPalindromeString(String palin) {
		
		String x = palin;
		
		String rev = "";
		
		for (int i = x.length()-1; i>=0 ; i--) {
			
			rev = rev + x.charAt(i);
			
		}
		
		return rev.equalsIgnoreCase(x) ? true : false;
	
	}
	
	public static boolean isPalindromeNum(int num) {
		
		int r,s = 0;
		int x = num;
		
		
		while(num > 0) {
			
			r = num % 10;
			num = num/10;
			s = s*10 + r;
			
		}
		
		return (s == x ) ? true : false;
	}

}
