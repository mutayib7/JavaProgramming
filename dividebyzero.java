import java.util.Scanner;
public class dividebyzero {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter dividend");
            int a = sc.nextInt();
            System.out.println("Enter divisor");
            int b = sc.nextInt();

            int result = a/b;
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide by 0");
        }
        finally{
            System.out.println("Program completed");
        }
    }
}
