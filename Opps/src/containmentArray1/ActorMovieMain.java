package containmentArray1;
import java.util.Arrays;
import java.util.Scanner;

public class ActorMovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Movie mov[]=new Movie[2];
		for(int i=0;i<2;i++) {
			System.out.println("enter id,boxofficecollection,name movie:list of"+(i+1)+"movie");
			int id =sc.nextInt();
			int boxofficecollection=sc.nextInt();
			String name=sc.next();
			
			Actor act[]=new Actor[2];
			for(int j=0;j<2;j++) {
			System.out.println("enter did,birthyear,dname,address:of the"+(j+1)+"actor");
			int did=sc.nextInt();
			int birthyear=sc.nextInt();
			String dname=sc.next();
			String Address=sc.next();
			
			Actor a=new Actor();
			a.setDid(did);
			a.setBirthyear(birthyear);
			a.setDname(dname);
			a.setAddress(Address);
			act[j]=a;
			
			}
			Movie m=new Movie();
			m.setId(id);
			m.setBoxofficecollection(boxofficecollection);
			m.setName(name);
			m.setAct(act);
			mov[i]=m;
			
			
	}
		System.out.println(Arrays.toString(mov));
		for(Movie m:mov) {
			for(Actor a:m.act) {
				if(a.getDname().equals("salmankhan")&& m.getBoxofficecollection()>500000) {
					System.out.println(m.name+" "+a.did+" "+a.birthyear+" "+a.address);
				}
			}
			
		}
	}
}
