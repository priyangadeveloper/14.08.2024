import java.util.Scanner;

public class Q3 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String name,department;
        double score;

        System.out.println("Enter the name: ");
        name =sc.nextLine();

        System.out.println("Enter the Score: ");
        score = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the department: ");
        department =sc.nextLine();

        double mark = (score/10);

        System.out.println("Your name is: "+name);
        System.out.println("your Score out of 10 is: "+mark +"/10");
        System.out.println("Your department is: "+department);
    }
    
}
