import java.util.*;

public class Ifcondition {



    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int score = sc.nextInt();

        if(score <50){
            System.out.println("you need to improve");

        }
        else if(score >= 50 && score <=70){
            System.out.println("Good Job!");

        }else{
            System.out.println("Excellent Performance");

        }

    }
    
}
