package Final;



final class Calculator1{
    public int add(int num1,int num2){
        return num1+num2;
    }
}
class Advcalculator extends Calculator1 {  //cannot extends because Calculator is a final class


}


class Code2{
    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
        int result = calc.add(2,3);
        System.out.println(result);
    }
}