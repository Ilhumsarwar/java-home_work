class Wallet{

    int balance;
    
    void deposit(int amount){
        balance += amount;
        System.out.println(amount + "mone is deposited");

    }
    
    void withdraw(int amount){
        if(balance > amount){
        balance -= amount;
        System.out.println(amount + " money is withdrawn");
    }
        else{
            System.out.println("Money Withdraw failed. Not enough balance.");
        }
    }

    void balanceCheck(){
        System.out.println("Current Balance: " + balance);
    }
}


public class Practicerecap {
    public static void main(String[] args){
    
    Wallet balance_1 = new Wallet();
    balance_1.deposit(1000);
    balance_1.balanceCheck();
    balance_1.withdraw(500);
    balance_1.balanceCheck();
    }
}
