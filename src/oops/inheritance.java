package oops;


//single inheritance and Hierarchical inheritance
class Animals {
    int nolegs = 4;

    void eat() {
        System.out.println("eating");
    }

    void walk() {
        System.out.println("walking");
    }
}

class Dog extends Animals {
    boolean canBark = true;

}

class  Cat extends  Animals{}



//multilevel inheritance

class A {
    void classA() {
        System.out.println("first class");
    }
}

class B extends A {
    void classB() {
        System.out.println("second class");
    }
}

class C extends B {
    void classC() {
        System.out.println("Third class");
    }
}


public class inheritance {
    public static void main(String[] args) {
        System.out.println("single inheritance");
        Dog d = new Dog();
        d.eat();
        d.walk();
        System.out.println("Num of Legs: " + d.nolegs);

        System.out.println("\nhierarchical inheritance");

        Cat cat=new Cat();
        cat.eat();
        cat.walk();

        System.out.println("\nMultilevel Inheritance");
        C c = new C();
        c.classC();
        c.classB();
        c.classA();
    }
}
