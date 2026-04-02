interface Animal{
    public void walk();
}
class Horse implements Animal{
    public void walk (){
        System.out.println("walk in 4 legs");
    }
}
public class oops5 {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
    }
}
