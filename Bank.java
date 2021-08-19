import java.util.Scanner;
class InsufficientBalance extends Exception
{
	public InsufficientBalance()
	{
		System.out.println("Sorry...!! You have insufficient balance in your Account!! ");
	}
}
public class Bank
{
    public static void main(String args[] )
    { 
    	
        int balance = 0 , withdraw, deposit;
        
        Scanner s = new Scanner(System.in);
        while(true)
        {
        	System.out.println("Welcome to our Bank !!! ");
        	System.out.println(" 1: Open a New Bank Account ");
            System.out.println(" 2: for Withdraw");
            System.out.println(" 3: for Deposit");
            System.out.println(" 4: for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
            	case 1: 
                System.out.println(" Create Account ");
                System.out.println(" Enter customer name : ");
                String name = s.next();
                System.out.println("Welcome!!!" +name);
                
                System.out.println(" Add amount to your account : ");
                System.out.println(" Enter amount: ");
                balance = s.nextInt();
                
                System.out.println(" Account is successfully created!!! ");
                System.out.println(" ");
                
                    
                break;
                    
                case 2:
                System.out.print("Enter amount to be withdrawn:");
                withdraw = s.nextInt();
                if(balance < withdraw)
                {
                	try
                	{ 
                		throw new InsufficientBalance();
                	}
                
                	catch(InsufficientBalance e)
                	{
                		System.out.print(e);
                	}
                }	
                
                else
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                    System.out.println("Remaining balance:"+balance);
                    
                    System.out.println(" ");
               
                break;
 
                case 3:
                	System.out.print("Enter money to be deposited:");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited");
                    System.out.println("");
                    break;
        
        		
            
            }
        }
    }
}
    
