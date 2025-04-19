class Calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int sub(int num1,int num2){
        return num1-num2;
    }
}
class Oops1{
    public static void main(String args[]){
        Calculator calc = new Calculator();

        int r1 = calc.add(5,5);
        int r2 = calc.sub(20,7);

        System.out.println(r1);
        System.out.println(r2);
    }
}