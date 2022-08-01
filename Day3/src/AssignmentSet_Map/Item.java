package AssignmentSet_Map;

public class Item {

	int id,price,qty;
	String name;
	Item(int id,String name,int qty,int price)
	{
		this.id=id;
		this.name=name;
		this.qty=qty;
		this.price=price;
	}
	public String toString() {
		return id+" "+name+" "+qty+" "+price;
	}
}
