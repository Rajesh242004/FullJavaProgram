package Threads;
class A extends Thread{
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println("hi java");
        }
    } 
}
class B extends Thread{
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println("hello java");
        }
     }
}
class Code2{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}