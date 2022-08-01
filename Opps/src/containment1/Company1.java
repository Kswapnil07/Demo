package containment1;

public class Company1 {
	 
	int id,year;
	String name,car;
	Car1 c1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public Car1 getC1() {
		return c1;
	}
	public void setC1(Car1 c1) {
		this.c1 = c1;
	}
	public String toString() {
		return id+" "+year+" "+name+" "+car+" "+c1;
	}
}
