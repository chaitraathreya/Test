class Count{
	//int i;
	static int i=0;
	Count(){
		i++;
	}
		
}


public class CountObject {

	 public static void main(String[] args){
		 Count c = new Count();
		 Count c1 = new Count();
		 Count c2 = c;
		 Count c3 = new Count();
		 
		 System.out.println(Count.class.getName());
		 System.out.println(Count.i);
		 
	 }
}
