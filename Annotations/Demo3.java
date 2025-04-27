package Annotations;
@FunctionalInterface
interface A{
    void show();
}
class Demo3{
    public static void main(String[] args) {
        A obj = ()->System.out.println("i a show");
        obj.show();
    }
}