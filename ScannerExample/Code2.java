package ScannerExample;
import java.util.*;
class Calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int sub(int num1,int num2){
        return num1-num2;
    }
}
class Code2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("The summ of "+a+" and "+b+" is "+calc.add(a,b));

        System.out.println("Enter the value of num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of num2:");
        int num2 = sc.nextInt();
        System.out.println("The sub of "+num1+" and "+num2+" is "+calc.sub(num1,num2));

        sc.close();
    }
}