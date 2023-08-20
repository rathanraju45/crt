package Day6;
class Parent{
    void display(){
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent{
    void display(){
        super.display(); //calling display of parent class
        System.out.println("This is child class.");
    }
}

public class Main{
    public static void main(String[] args){
        Child c1=new Child();
        c1.display();
    }
}