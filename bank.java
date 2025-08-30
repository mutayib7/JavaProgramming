import java.util.Scanner;

public class bank {
    int ac_no;
    String name;
    int balance;

    bank(int ac, String name_, int bal)
    {
        ac_no = ac;
        name= name_;
        balance = bal;
    }

    Scanner sc=new Scanner(System.in);

    void deposit(int amt){
        balance+= amt;
        System.out.println("Updated balance is: " );
        display_bal();
    }
    void withdraw(int amt){
        balance-=amt;
        System.out.println("Updated balance is: " );
        display_bal();
    }
    void display_bal(){
        System.out.println(balance + "\n");
    }

    public static void main(String args[])
    {
        bank b = new bank(1234, "labeeb", 100);
        b.deposit(100);
        b.withdraw(50);
        
    }
    
}
