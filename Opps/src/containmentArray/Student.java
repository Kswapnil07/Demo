package containmentArray;

public class Student {

	int id,marks;
	String name,contact;
	Student(int id,int marks,String name,String contact){
		this.id=id;
		this.marks=marks;
		this.name=name;
		this.contact=contact;
	}
	public String toString() {
		return id+" "+marks+" "+name+" "+contact+"\n";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
