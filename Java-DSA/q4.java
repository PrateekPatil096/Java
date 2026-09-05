import java.util.*;
public class q4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int day=sc.nextInt();
        String str="";

        switch(day){
            case 1:str="monday";
            break;

            case 2:str="tuesday";
            break;

            case 3:str="wednesday";
            break;

            case 4:str="thursday";
            break;

            case 5:str="friday";
            break;

            case 6:str="saturday";
            break;

            case 7:str="sunday";
            break;

            default: str="invalid";
            break;
        }

        System.out.println("result  " + str);
        
    }
    
}
