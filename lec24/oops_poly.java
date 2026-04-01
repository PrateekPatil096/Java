class Stundent{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class oops_poly {
    public static void main(String[] args) {
        Stundent s1=new Stundent();
        s1.name="toji";
        s1.age=22;
        s1.printInfo(s1.name,s1.age);

    }
}
