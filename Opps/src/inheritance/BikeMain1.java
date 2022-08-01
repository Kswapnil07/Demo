package inheritance;
import java.util.Scanner;
public class BikeMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the price,colour,model,milage,weight,modelno,name ");
		int price=sc.nextInt();
		String colour=sc.next();
		String model=sc.next();
		String milage=sc.next();
		int weight=sc.nextInt();
		String modelno=sc.next();
		String name=sc.next();
		
		Pulsor1 p1=new Pulsor1();
		p1.setPrice(price);
		p1.setColour(colour);
		p1.setModel(model);
		p1.setMilage(milage);
		p1.setWeight(weight);
		p1.setModelno(modelno);
		p1.setName(name);
		
		System.out.println(p1);
		p1.engine();
		
		
	}

}
