package Threads;

public class Code3 {
    public static void main(String[] args) {
        Runnable obj1 = ()->{
            for(int i=1;i<=5;i++){
                System.out.println("hi java");
            }
        };

        Runnable obj2 = ()->{
            for(int i=1;i<=5;i++){
                System.out.println("hello java");
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        
    }
    
}
