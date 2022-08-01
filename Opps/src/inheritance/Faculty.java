package inheritance;

public class Faculty extends Person {

	int id,salary;
	String subject,performance;
	
//	void setDataFaculty(int id,int salary,String subject,String performance)
//	{
//		this.id=id;
//		this.salary=salary;
//		this.subject=subject;
//		this.performance=performance;
//		
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	void bonus() {
		if(performance.equals("A")) {
			salary=salary*20/100+salary;
			System.out.println("add salary with bonous:"+salary);
		}
		else if(performance.equals("B")) {
			salary=salary*15/100+salary;
			System.out.println("add salary with bonous:"+salary);
		}
		else if(performance.equals("C")) {
			salary=salary*10/100+salary;
			System.out.println("add salary with bonous:"+salary);
		}
		else if(performance.equals("D")) {
			salary=salary*10/100+salary;
			System.out.println("add salary with bonous:"+salary);
		}
			
		}
	
	public String toString() {
		return id+" "+salary+" "+subject+" "+performance+" "+name+" "+contact+" "+address+" "+gender;
	}
	}

