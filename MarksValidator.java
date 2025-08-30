import java.util.Scanner;

class RangeException extends Exception
{
    public RangeException(String message)
    {
        super(message);
    }
}
public class MarksValidator
{
    static int readValidMark(Scanner sc, int subjectNumber)
    {
        while(true)
        {
            System.out.println("Enter marks for Subject" + subjectNumber);
            int mark = sc.nextInt();
            try
            {
                if(mark < 0 || mark > 50)
                {
                    throw new RangeException("Invalid marks range, enter between 0 and 50");
                }
                return mark;
            }
            catch(RangeException e)
            {
                System.out.println(e.getMessage() );
                System.out.println("Please re enter valid marks");
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[6];

        for(int i = 1; i <= 5; i++)
        {
            marks[i] = readValidMark(sc, i);
        }
        System.out.println("After all valid entries: ");
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(marks[i]);
        }
    }
}
