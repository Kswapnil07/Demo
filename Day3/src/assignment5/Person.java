package assignment5;

public class Person {
	int age;
	String name,gender ,address;
	Address a1;

	
		void setAge(int age) {
			this.age=age;
		}
		
		int getAge() {
			return age;
		}
		
		void setName(String name) {
			this.name=name;
		}
		String getName() {
			return name;
		}
		
		void setGender(String gender) {
			this.gender=gender;
		}
		String getGender() {
			return gender;
		}
		void setAddress(String address) {
			this.address=address;
		}
		String getAddress() {
			return address;
		}
		void setA1(Address a1) {
			this.a1=a1;
		}
		Address getA1() {
			return a1;
		}
		
		
		public String toString() {
			return age+" "+name+" "+gender+" "+address+" "+a1;
		}
	

}
