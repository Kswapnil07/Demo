package classandobject18522;

public class Bank {
void gpay(int amt,Account a) {
	int bal=a.getbalance();
	System.out.println("Available balance: "+bal);
	if(bal>amt) {
		bal=bal-amt;
		a.setBalance(bal);
		System.out.println("remaining balance: "+a.getbalance());
	}
	else
		System.out.println("balance is less ");
}

}
