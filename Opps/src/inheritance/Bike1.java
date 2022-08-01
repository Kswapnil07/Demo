package inheritance;

public class Bike1 {

	int price;
	String colour,milage,model;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getMilage() {
		return milage;
	}
	public void setMilage(String milage) {
		this.milage = milage;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	void wheelno() {
		System.out.println("2 wheels");
	}
	void seats() {
		System.out.println("2 seats");
	}
	
}
