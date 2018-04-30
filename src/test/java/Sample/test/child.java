package Sample.test;

class noArgument{
	void print(){
		System.out.println("print");
	}
}


class parent{
	int x;
	
	parent(int o){
		System.out.println("parent constrcutor");
		x = 5;
	}
}

public class child extends parent{
	int y;
	protected child(int w){
		super(7);
			System.out.println("child constructor");
		y=10;
	}



	public static void main(String[] args){
		parent p = new child(3);
		System.out.println(((child)p).y);
		System.out.println(p.x);
		
		child c = new child(3);
		System.out.println(c.y);
		
		noArgument np = new noArgument();
		np.print();
		fibonacci d = new fibonacci();
		
		
		//TestInterface intf = new myclass();
	}
}


