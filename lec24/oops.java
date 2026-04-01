class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
class Stundent{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Stundent(){
        System.out.println("constutor called");
    }
}

public class oops {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";

        pen1.printcolor();
        pen2.printcolor();
        Stundent s1=new Stundent();
        s1.name="toji";
        s1.age=25;
        s1.printInfo();
    }   

    
}
