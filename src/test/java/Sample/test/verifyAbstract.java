package Sample.test;

abstract class my {
    public void mymethod() {
        System.out.print("Abstract");
    }
}

public class verifyAbstract {
	public static void main(String a[]) {
        my m = new my() {};
       // m.mymethod();
        
        String s = "https://devatlas.capella.edu/atlas/secure/offering/tab/2280";
        
        
        
        System.out.println(s.replaceFirst(".*/([^/?]+).*", "$1"));
        
        System.out.println(s);
        
        System.out.println(s.replaceFirst(".*/([^/?]+)", "$1"));
        
     // Removes whitespace between a word character and . or ,
        String EXAMPLE_TEST = " This i s a , example .";
        String pattern = "(\\w)(\\s+)([\\.,])";
        System.out.println(EXAMPLE_TEST.replaceAll(pattern, "$1$3"));
        
        s = "/atlas/secure/course/6225378/edit?offeringId=238&courseIsShared=false";
        System.out.println(s.replaceAll(".*/([^/?]+).*", "$1"));
        
    }
}
