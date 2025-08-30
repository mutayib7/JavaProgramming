import java.util.Scanner;

public class studentgrade {
    int roll_no;
    String name;
    String course;
    int marks[] = new int[3];

    void accept(){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter roll no\n");
    roll_no= sc.nextInt();
    sc.nextLine();
    System.out.print("Enter name\n");
    name=sc.nextLine();
    System.out.print("Enter course name\n");
    course=sc.nextLine();
    System.out.println("Enter marks in three subjects:");
    for(int i = 0; i < 3; i++)
    {
        marks[i]=sc.nextInt();
    }
    }

    void total_avg(){
        int total = 0;
        for(int i: marks){
            total+= i;
        }
        double avg=total/3.0;
        System.out.println(total);
        System.out.print("\n");
        System.out.println(avg);
        System.out.print("\n");
    }

    void display(){
        System.out.println("Roll no is: "+ roll_no + "\n");
        System.out.println("Name is: "+ name + "\n");
        System.out.println("Course name  is: "+ course + "\n");
        System.out.println("Marks in three subjects: \n");
        for(int i: marks){
            System.out.print(i + "\t");
        }
        System.out.println("\n");
        total_avg();

    }

    public static void main(String args[]){
        studentgrade s=new studentgrade();
        s.accept();
        s.display();

    }
}
