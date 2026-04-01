class Stundent{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Stundent(Stundent s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Stundent(){

    }
}
public class oops2 {
    public static void main(String[] args) {
        Stundent s1=new Stundent();
        s1.name="toji";
        s1.age=22;
        Stundent s2=new Stundent(s1);
        s2.printInfo();
    }
}
