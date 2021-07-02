
package chap5;

public class MyAccount {
    public static void main(String[] args) {
    SavingAccount sx = new SavingAccount(1809,"Thanyarat",1000);
           sx.printDetails();
           sx.withdraw(1000);
           sx.printDetails(); 
    FixedDepositAccount fa = new FixedDepositAccount(2209, "Lookyee",1000);
           fa.printDetails();
           fa.deposit(100);
           fa.printDetails();
           
           
    }
 
}
