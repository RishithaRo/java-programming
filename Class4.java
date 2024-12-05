// Intialize the value of an object by variable,method 
import java.util.*;
class Department
{
    int faculty_no;
    String faculty1;
    String faculty2;
    String faculty3;
    void facultyNames(String p1,String p2,String p3)
    {
        faculty1 = p1;
        faculty2 = p2;
        faculty3 = p3;
    }
    void staff()
    {
        System.out.println(faculty1+" "+faculty2+" "+faculty3);
    }
}

public class Class4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Department ai_ds = new Department();
        Department csbs = new Department();
        Department cse = new Department();
        System.out.print("Enter number of faculty in ai_ds:");
        ai_ds.faculty_no = sc.nextInt();
        System.out.print("Enter number of faculty in csbs:");
        csbs.faculty_no = sc.nextInt();
        System.out.print("Enter number of faculty in cse:");
        cse.faculty_no = sc.nextInt();
        ai_ds.facultyNames("Rohith","Rishitha","Sravya");
        csbs.facultyNames("Neha sri","Gomathi","Harshini");
        cse.facultyNames("Gowsalya","Sharmitha","Pooja sree");
        ai_ds.staff();
        csbs.staff();
        cse.staff();
    }
}
