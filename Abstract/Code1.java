package Abstract;       //an abstract method can be created inside the abstract class only but the abstract class can have normal methods also
abstract class Car{     // we cannot create a object for the abstract class
    public abstract void drive(); //whenever we declare a abstract method we should define it compulsory
    public abstract void fly();

    public void playmusic(){
        System.out.println("Music Playing");
    }
} 
class SuperCar extends Car{
    public void drive(){
        System.out.println("diving");
    }
    public void fly(){
        System.out.println("Flying car");
    }

}class Code1{
    public static void main(String[] args) {
        //SuperCar sc = new SuperCar();
        Car sc = new SuperCar(); //Dynamic method dispatch
        sc.drive();
        sc.fly();
        sc.playmusic();
    }
}
