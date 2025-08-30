import java.util.Scanner;

class OddNumber extends Exception{
    public OddNumber(String msg){
        super(msg);
    }
}
public class OddChecker{
    static void checkOdd(int n) throws OddNumber{
        if(n % 2!=0)
        {
            throw new OddNumber("Number is odd");
        }
        System.out.println("Number is even, no error");
    }
    public static void main(String args[])
    {
        try
        {
            checkOdd(50);
        }
        catch(OddNumber e)
        {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
