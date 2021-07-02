
package chap5;

public class SavingAccount extends BankAccount{

    public SavingAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance);
    }
    @Override
    public void withdraw(double amount) {
        System.out.println("ถอนเงิน = "+amount);
        double bal = getBalance() - amount;
        if(bal > 50){    
           setBalance(bal); 
        }else{
            System.out.println("ยอดเงินคงเหลือ < 50 บาท ไม่ให้ถอนค่ะ");
        }
    }       
}
