package AssignmentInheritance;
import java.util.Arrays;
import java.util.Scanner;

public class IdProofPersonmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	
			Person per[]=new Person[2];
			for(int i=0;i<2;i++) {
				System.out.println("enter the id,dname,contact,address");
				int id=sc.nextInt();
				String dname=sc.next();
				String contact=sc.next();
				String address=sc.next();
				
				IdProof Ip[]=new IdProof[2];
				for(int j=0;j<2;j++) {
					System.out.println("enter number name validity");
					int number=sc.nextInt();
					String name=sc.next();
					String validity=sc.next();
					
					IdProof d=new IdProof();
					d.setName(name);
					d.setNumber(number);
					d.setValidity(validity);
					Ip[j]=d;	
				
			}
				Person p=new Person();
				p.setId(id);
				p.setDname(dname);
				p.setContact(contact);
				p.setAddress(address);
				per[i]=p;
				
				
				System.out.println(Arrays.toString(per));
			
		}
		
		for(Person s:per) {
			for(IdProof a:s.Ip) {
				if(s.getAddress().equals("pune")&& a.getName().equals("adharcard"))
				{
					System.out.println(s.dname+" "+s.id+" "+s.address);
				}
			}
		}
}}
