class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new B(); // Parent reference, Child object-Dynamic Method Dispatch
        obj.show();      // show() is overridden
    }
}
