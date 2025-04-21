import ScannerExample.*;
import java.util.*;
class PackageEx{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("ENter the value of b: ");
        int b = sc.nextInt();

        int result = calc.add(a,b);
        System.out.println("The sum of "+a+" and "+b+" is "+result);

       
    }
}

