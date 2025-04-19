class Mobile{
    String brand;
    int price;
    static String model;

    public void show(){
        System.out.println("Brand:"+brand+"\nPrice"+price+"\nModel"+model);
    }

}
class Oops2{
    public static void main(String args[]){
        Mobile obj1 = new Mobile();
        obj1.brand="Apple";
        obj1.price=90000;
        Mobile.model="iphone 15";   //sets model name as iphone 15

        Mobile obj2 = new Mobile();
        obj2.brand="Samsung";
        obj2.price=50000;
        Mobile.model="s22 ultra";    //updates all model as s22 ultra

        obj1.show();
        obj2.show();
    }
}