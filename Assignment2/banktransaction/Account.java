package banktransaction;

public class Account {
	int balance;
	int accountNo;
	 public void withdraw(int bal) throws InterruptedException {
		if(balance>=bal) {
			balance = balance - bal;
			System.out.println("accountNo:" +accountNo + " withdraw Rs " + bal);
			Thread.sleep(1000);
		}else {
			System.out.println("accountNo:"+accountNo + " insufficient balance");
		}
	
	}
	 public void Deposit(int bal) throws InterruptedException {
		if(bal>0) {
			balance = balance + bal;
			System.out.println("accountNo:"+accountNo + " balance Rs " + balance);
			Thread.sleep(1000);
		}else {
			System.out.println("accountNo:"+accountNo + "doesn't have amount to deposit");
		}
		
		Thread.sleep(1000);
	}
	 }

	