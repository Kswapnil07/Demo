package constructorChain;

public class Example {
	
	Example(int a){
		this();
		System.out.println("In single parameter constructor:"+a);
	}
	Example(){
		//this(100);
		System.out.println("In default constructor");
	}
	Example(int a,int b){
		this(100);
		System.out.println("In 2 parameter constructor:"+b);
	}

	Example(int a,int b,int c){
		this(100,200);
		System.out.println("In 3 parameter constructor:"+b+" "+a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example e=new Example();
		
		
	}

}
