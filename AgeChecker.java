import java.util.Scanner;

class TooYoung extends Exception{
    public TooYoung(String msg){
        super(msg);
    }
}
public class AgeChecker{
    static void checkAge(int age) throws TooYoung{
        if(age < 18)
        {
            throw new TooYoung("You must be atleast 18 to vote");
        }
        System.out.println("Age is valid, eligible to vote");
    }
    public static void main(String args[])
    {
        try
        {
            checkAge(5);
        }
        catch(TooYoung e)
        {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
