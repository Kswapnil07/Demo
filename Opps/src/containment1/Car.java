package containment1;

public class Car {
	int id,price;
	String name,model;
	
	Car(int id,int price,String name,String model){
		this.id=id;
		this.price=price;
		this.name=name;
		this.model=model;
		
	}
	public String toString() {
		return id+" "+price+" "+name+" "+model;
	}

}
