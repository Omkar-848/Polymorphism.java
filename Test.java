package Polymorphism;

public class Test {
    
    void show(int a, int b) { // 2 int parameters
        System.out.println("1");
    }

    void show(int a) { // 1 int parameter
        System.out.println("2");
    }

    void show(int a, String b) { // int and String
        System.out.println("3");
    }

    void show(String a, int b) { // String and int
        System.out.println("4");
    }

    public static void main(String[] args) {
        Test T = new Test();
        T.show(10, "abc");    // Output: 3
        T.show("abc", 20);    // Output: 4
        T.show(10);           // Output: 2
        T.show(10, 20);       // Output: 1
    }
}
