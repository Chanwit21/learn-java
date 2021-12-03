import java.util.Scanner;

/**
 * Learn
 */
public class Learn {

    int a = 1;

    public static void main(String[] args) {
        System.out.println("Test");
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนชื่อของคุณnextLine \u0102:");
        String name = sc.nextLine();
        System.out.print("ป้อนชื่อของคุณnext :");
        String nameNext = sc.next();
        // System.out.print("Input year :");
        // double year = sc.nextDouble();
        // double age = 2564 - year;
        sc.close();
        System.out.println(name);
        System.out.println(nameNext);
        // System.out.println(year);
        // System.out.println(age);

        Learn instantLearn = new Learn();
        System.out.print(instantLearn.a);
        
    }
}