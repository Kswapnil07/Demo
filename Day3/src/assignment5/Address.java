package assignment5;

public class Address {
	String city,state,country;
		

	void setCity(String city) {
			this.city=city;
		}
		String getCity(){
			return city;
		}
	void setState(String state) {
		this.state=state;
	}
	String getState() {
		return state;
	}
	void setCountry(String country) {
		this.country=country;

	}
	String getcountry() {
		return country;
	}
	
	
	public String toString() {
		return city+" "+state+" "+country;
	}
	
	
}
