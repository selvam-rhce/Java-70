package co.edureka;

public class Bank {
 public void deposit() {	 
	 System.out.println("Bank: Generic deposit..");
 }
 public void deposit(String acno, float amt) {
	 System.out.println("Rs."+amt+" deposited in A/C. "+acno);
 }
}
