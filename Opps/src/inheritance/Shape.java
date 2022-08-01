package inheritance;

 public class Shape {
	 public void area() {
	System.out.println("2efwr");	
	}
}
	 class Rectan extends Shape{
		 public void display() {
			 System.out.println("bdedi");
		 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectan r=new Rectan();
		r.area();
		r.display();
	}

}
