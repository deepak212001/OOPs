// Interface 1
interface A {
    void methodA();
}

// Interface 2
interface B {
    void methodB();
}

// Class implementing multiple interfaces A and B
class MyClass implements A, B {
    public void methodA() {
        System.out.println("Inside methodA");
    }

    public void methodB() {
        System.out.println("Inside methodB");
    }

    // Additional method in MyClass
    void myMethod() {
        System.out.println("Inside myMethod");
    }
}



public class Multiple {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA(); // Calling method from interface A
        obj.methodB(); // Calling method from interface B
        obj.myMethod(); // Calling method from MyClass
    }
}
