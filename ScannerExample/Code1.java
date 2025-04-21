package ScannerExample;
import java.util.*;

public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b :");
        int b = sc.nextInt();

        int result = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+result);

        System.out.println("Enter the name: ");
        String username = sc.next();
        System.out.println("The username is: "+username);

        System.out.println("Enter the double value1: ");
        double value1 = sc.nextDouble();

        System.out.println("Enter the double value2: ");
        double value2 = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter your full name: ");
        String Fullname = sc.nextLine();

        System.out.println("The fullname is: "+Fullname);

        sc.close();

        
    }
    
}
