package oops;

public class ClassesAndObject {
    String name;
    int rollnum;
    //method
    public void display(){
        System.out.println("Name : " + name );
        System.out.println("Roll num : " + rollnum);
    }

    //constructor
    public  ClassesAndObject(String name,int rollnum){
        this.name=name;
        this.rollnum=rollnum;
        System.out.println("Name : " + name);
        System.out.println("roll num :" +rollnum);
    }
    //address
    public void  addressDisplay(){
        System.out.println("address : " + this);
    }

    public static void main(String[] args) {
        ClassesAndObject obj=new ClassesAndObject("sowmi",222);//object creation
        obj.name="sowmiya";
        obj.rollnum=111;
        obj.display();
        obj.addressDisplay();

        ClassesAndObject obj2=new ClassesAndObject("anu",123);


    }
}
