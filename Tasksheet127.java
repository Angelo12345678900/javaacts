// Abstract class with an abstract method and a concrete method
abstract class abstractClass {
    abstract void abstractMethod();  // Abstract method to be implemented by subclasses

    // Concrete method
    void concreteMethod() {
        System.out.println("This is a concrete method.");
    }
}

// Class B implements the abstract method
class B extends abstractClass {
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}

// Class C also implements the abstract method
class C extends abstractClass {
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}

public class Tasksheet127 {
    public static void main(String[] args) {
        // Create an instance of B and invoke methods
        B b = new B();
        b.abstractMethod();  // B's implementation
        b.concreteMethod();  // Concrete method

        // Create an instance of C and invoke methods
        C c = new C();
        c.abstractMethod();  // C's implementation
        c.concreteMethod();  // Concrete method
    }
}
