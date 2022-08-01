package ArrayObject;

public class Student1 {

		int id,marks;
		String name,dept;
		
		Student1(){}

		public void setId(int id) {
			this.id=id;
		}
		public int getid() {
			return id;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getname() {
			return name;
		}
		public void setDept(String dept) {
			this.dept=dept;
		}
		public String dept() {
			return dept;
		}
		
		public void setMarks(int marks) {
			this.marks=marks;
		}
		public int getmarks() {
			return marks;
		}
		public String toString() {
			return id+" "+name+" "+dept+" "+marks;
		}
	}


