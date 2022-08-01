        package practics;
        import java.util.Scanner;
        public class productdigit {

	    public static void main(String[] args) {
	    	int num,product=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("entere any number");
		 num=sc.nextInt();
	    
		while(num>0) {
			product= product*(num%10);
			num=num/10;
				
		}
System.out.println("product of digit :"+product);
	}

}
