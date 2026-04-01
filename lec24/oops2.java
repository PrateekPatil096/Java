class Stundent{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Stundent(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class oops2 {
    public static void main(String[] args) {
        Stundent s1=new Stundent("toji", 22);
        s1.printInfo();
    }
}
