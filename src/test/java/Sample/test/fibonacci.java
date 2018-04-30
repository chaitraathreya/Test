package Sample.test;

public class fibonacci {
	 public fibonacci(){
		System.out.println("print");
	}
	
	public static void main(String args[]){
				
		int r = 0;
		int sum = 0;
		int n = 454;
		int temp = n;
		
		while(n > 0){
			r = n%10;
			
			n = n/10;
			
			sum = (sum*10)+r;
			
			System.out.println("n = "+n+" , r="+r+", sum = "+sum);
				
		}
		if(temp == sum){
			System.out.println("It is palindrome");
		}else{
			System.out.println("Not a palindrome");
		}
		
		StringBuffer sb = new StringBuffer("malayalam");
		StringBuilder sb1 = new StringBuilder("malayalam");
		
		String rev = sb.reverse().toString();
		
		
		
		
		System.out.println(rev);
		
		
		
	}

}
