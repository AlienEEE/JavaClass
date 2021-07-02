
package chap5;

public class FixedDepositAccount extends BankAccount {

    public FixedDepositAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("ฝากเงิน = "+amount);
        double fx = amount;
        if(fx>500){
               setBalance(fx); 
        }else{
            System.out.println("ยอดเงินฝาก < 500 ฝากไม่ได้ค่ะ ");
        }
    }
    
    
}
