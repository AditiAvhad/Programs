package oops;

public class BankAccount {
   int amount;
   BankAccount(int amount){
       this.amount=amount;
   }
    void deposite(){
        System.out.println("Your amount is deposited");
    }
    void withdraw(){
        System.out.println("You can withdrwal the amount");
    }
class SavingAccount extends BankAccount{
    SavingAccount(int amount){
        super(amount);
    }
        void withdraw(){
            if(amount<100){
                System.out.println("You cant withdraw the money");
            }else{
                System.out.println("Withdraw succesfully");
            }

        }
}
}
