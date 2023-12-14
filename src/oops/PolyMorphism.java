package oops;

public class PolyMorphism {
    public static void main(String[] args) {
        Calculate c=new Calculate();
        c.add(10,10);
        c.max(2,6,1);

    }
}

class Calculate{
    void add(int a,int b){
        int c=a+b;
        System.out.println("Addition :" + c);
    }

    void max(int a, int b,int c){
        if(a>b){
            if(a>c){
                System.out.println(" a is big");
            }else{
                System.out.println("c is big");
            }
        }
        else{
            if(b>c)
                System.out.println("b is big");
            else
                System.out.println(" c is big");
        }
    }
}

//Method overloading-->same method name use different purpose
//Method overriding-->same method name but passing arugument are different