import java.util.*;
public class q41 {
    
    static class student{
        String name;//object variable 
        int age;

        student(String name,int age){//constructor parameter
            this.name=name;
            this.age=a;
        }
        void display(){
            System.out.println(name+" "+age);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the name");
        String name=sc.nextLine();
        System.out.println("enter the age ");
        int age=sc.nextInt();

        student s=new student(name, age);
        s.display();
    }
    
}
