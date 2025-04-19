package Inheritance;

class SciCalc extends AdvCalc{
    public int add(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }
    
}class File3{
    public static void main(String args[]){
        SciCalc obj = new SciCalc();
        int result1 = obj.sub(1,2);
        int result2 = obj.mul(3,5);

        System.out.println(result1+result2);
    }
}
