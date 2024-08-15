import java.util.*;

public class Mark {
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter the Tamil mark: ");
        int Tamil = sc.nextInt();

        System.out.println("Enter the English mark: ");
        int English = sc.nextInt();

        System.out.println("Enter the Maths mark: ");
        int maths = sc.nextInt();

        System.out.println("Enter the Science mark: ");
        int science = sc.nextInt();

        System.out.println("Enter the Social mark: ");
        int social =sc.nextInt();

        int total =(Tamil+English+maths+science+social);
        int avg = total/5;


        if(avg < 35)
{
    System.out.println("Additional Class is Required");
}else{
    System.out.println("You are good to go");
}


    }
}
