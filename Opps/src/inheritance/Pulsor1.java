package inheritance;

public class Pulsor1 extends Bike1 {

	int weight;
	String modelno,name;
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getModelno() {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return weight+" "+modelno+" "+name+" "+price+" "+colour+" "+milage+" "+model;
	}
	void engine() {
		System.out.println("220 cc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
