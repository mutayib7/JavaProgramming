import java.util.Scanner;
public class multiple {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("Enter 5 integers:");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }
        try{
            System.out.println("Enter two numbers to divide");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a/b;
            System.out.println("Result: " + result);

            System.out.println("Enter an index");
            int index = sc.nextInt();
            System.out.println("Array value: " + arr[index]);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }
    }
}
