class Stundent{
    String name;
    static String School;
    public static void changeSchool(){
        School="newschool";
    }
}
public class oops6 {
    public static void main(String[] args) {
        Stundent.School="dsatm";
        Stundent student1=new Stundent();
        student1.name="tony";
        System.out.println(student1.School);
    }
    
}
