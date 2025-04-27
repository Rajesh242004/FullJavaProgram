package Override;
class A{
    public void show(){
        System.out.println("in a show");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("in b show");

    }
}
class Demo{
    public static void main(String args[]){
        B obj = new B();
        obj.show();
    }
}