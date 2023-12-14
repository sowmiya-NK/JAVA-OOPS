package oops;

public class Encapsulation {
    String name;
    private int id;//accesing private value we have to create setter and getter method
    public void setValue(int id,String name){
        this.id=id;
        this.name=name;


    }
    public void getValue(){
        System.out.println("id : " + id);
        System.out.println("name : " + name);
    }
    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
        e.setValue(1,"aaa");
        e.getValue();


    }
}
