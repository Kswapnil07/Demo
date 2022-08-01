package classs;

public class Rectangle {

	int length;
	int width;
	void insert(int l , int w)
	{
		length=l;
		width=w;
	}
	void area(){
	System.out.println(length*width);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r=new Rectangle();
		r.insert(3, 9);
		r.area();
				
	}

}
