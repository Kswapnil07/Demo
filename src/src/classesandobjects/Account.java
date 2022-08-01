package classesandobjects;

public class Account {
	
		int accno,balance;
		String name,contact;
		
		int getBalance()
		{
			return balance;
		}
		
		void setBalance(int balance)
		{
			this.balance=balance;
		}
		
		void setAccno(int accno)
		{
			this.accno=accno;
		}
		
		int getAccno()
		{
			return accno;
		}
		
		void setName(String name)
		{
			this.name=name;
		}
		
		String getName()
		{
			return name;
		}
		
		void setContact(String contact)
		{
			this.contact=contact;
		}
		
		String getContact()
		{
			return contact;
		}
		
		/*void setData(int accno,String name, int balance,String contact)
		{
			this.accno=accno;
			this.name=name;
			this.balance=balance;
			this.contact=contact;
			
		}

*/		public String toString()
		{
			return name+" "+accno+" "+ balance+" "+contact;
		}
}
