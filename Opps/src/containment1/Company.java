package containment1;

public class Company {

	int id,year;
	String name,car;
	Car c;
	
	Company(int id,int year,String name,String car, Car c){
		this.id=id;
		this.year=year;
		this.name=name;
		this.car=car;
		this.c=c;
		
	}
	public String toString() {
		return id+" "+year+" "+name+" "+car+" "+c;
	}
	
}
