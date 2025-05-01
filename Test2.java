package Polymorphism;

public class Test2 { // Parent class

    void show() { // Method with no arguments
        System.out.println("1");
    }
}

class xyz extends Test2 { // Child class extending Test2

    void show(int a) { // Overloaded method with one int argument
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test2 t = new Test2(); // Creating an instance of parent class
        t.show(); // Output: 1

        xyz x = new xyz(); 
        x.show();      // Output: 1 (inherited from Test2)
        x.show(10);    // Output: 2 (from xyz)
    }
}


