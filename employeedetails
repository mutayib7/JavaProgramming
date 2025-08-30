import java.util.Scanner;

public class employeedetails{
    int empID;
    String name;
    int basic_sal;

    public employeedetails(int emplid, String name, int base)
    {
        empID= emplid;
        this.name=name;
        basic_sal= base;
    }
    double getHra()
    {
        return 5.0* basic_sal/100;
    }
    double getda()
    {
        return 2.5* basic_sal/100;
    }
    double getGrossSal()
    {
        return basic_sal+getHra()+getda();
    }
    void printSalSlip()
    {
        System.out.println("HRA = " + getHra());
        System.out.println("DA = " + getda());
        System.out.println("Total = " + getGrossSal());
    }
    public static void main(String args[])
    {
        employeedetails e = new employeedetails(11,"Abuzar", 600000);
        e.printSalSlip();
        

    }

}
