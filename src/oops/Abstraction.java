package oops;

//we cannot create object for abstract class
abstract  class computer{
    void turnOn(){
        System.out.println("computer on");
    }
    abstract  void turnOff();//just declare abstract method without body
}
//we create object so we create another class to inherit that abstract class
class Hp extends  computer{
    @Override
    void turnOff() {
        System.out.println("computer off");

    }
}
public class Abstraction {
    public static void main(String[] args) {
    Hp obj=new Hp();
    obj.turnOn();
    obj.turnOff();
    }
}
