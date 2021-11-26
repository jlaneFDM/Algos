package come.isPrime.www;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   System.out.println(checkPrime(10)); 
		
	}
	
	private static String checkPrime(int n) {
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return "Not Prime";
			}
						
		}
		return "Prime";
				
	}

}
