import java.util.Scanner;

public class movie{
    String name;
    String director;
    int rating;
    int release_year;

    public movie(String n, String d, int r, int y)
    {
        name=n;
        director=d;
        rating=r;
        release_year=y;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
        System.out.println("Release year: " + release_year);
    }
    static void display_good(movie m)
    {
        
        if(m.rating > 5)
        {
            System.out.println(m.name);
        }
    }
    public static void main(String args[])
    {
        movie m1 = new movie("ABC1", "XYZ1", 9, 2001);
        movie m2 = new movie("ABC2", "XYZ2", 7, 2002);
        movie m3 = new movie("ABC3", "XYZ3", 3, 2003);
        movie m4 = new movie("ABC4", "XYZ4", 4, 2004);

        display_good(m1);display_good(m2);display_good(m3);display_good(m4);
        m3.display();
    }
}
