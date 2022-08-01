package containment1;

public class CarCompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1=new Car(1,50000,"swift","2015");
		Car c2=new Car(2, 80000, "tigor","2018");
		Car c3=new Car(3,50000,"tiago","2020");
		Car c4=new Car(4,50000,"nexon","2021");
		Car c5=new Car(15,50000,"baleno","2021");
		
		Company a1=new Company(101,2021,"suzuki","alto",c1);
		Company a2=new Company(102,2022,"Tata","tiago",c2);
		Company a3=new Company(103,2020,"Tata","tigor",c3);
		Company a4=new Company(104,2018,"Tata","nexon",c4);
		Company a5=new Company(105,2022,"Tata","tigor",c5);
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
	}

}
