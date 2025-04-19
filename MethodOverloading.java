class Calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public double add(double num1,double num2){
        return num1+num2;
    }
}
class MethodOverloading{
    public static void main(String args[]){
        Calculator calc = new Calculator();

        int r1 = calc.add(5,5);
        int r2 = calc.add(2,3,3);
        double r3 = calc.add(2.2,2.3);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}