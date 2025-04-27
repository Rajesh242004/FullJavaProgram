package Annotations;     //(->)Lambda expression works only with functional interface 
@FunctionalInterface     //Functional interface takes only one method inside the interface
interface A{
    int add(int num1,int num2);
}
class Demo2{
    public static void main(String[] args) {
        A obj = (num1,num2) -> num1+num2;
        int result = obj.add(2,3);
        System.out.println(result);
    }
}


