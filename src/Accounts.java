
public class Accounts 
{
    private String accountNumber;
    private String accountHolder;
    private String openDate;
    private double balance;
    
    public Accounts(String accNumber,String accHolder,String date,double accBalance)
     {
        this.accountNumber = accNumber;
        this.accountHolder = accHolder;
        this.openDate = date;
        this.balance = accBalance;
        
     }
    
    public void withdraw(double amount)
    {
        this.balance = this.balance-amount;
    }
    
    public void deposite(double amount)
    {
        this.balance = this.balance+amount;
    }
    public void transfer(Accounts a,double amount)
    {
        this.withdraw(amount);
        a.deposite(amount);
        
    }
    public String getAccountHolder()
    {
        return this.accountHolder;
    }
    
     public String getAccountOpenDate()
    {
        return this.openDate;
    }
     
      public double getBalance()
    {
        return this.balance;
    }
    
    
    @Override
    public String toString()
    {
       return this.accountNumber;
    }
}
