import java.util.*;

public class Comstring {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("ok let me Tell Meghana dead or alive : ");

        String statement =sc.nextLine();
        String a = statement.toLowerCase();

        if("dead".equals(a)){

            System.out.println("Surya meets Ramya");
        }else{
            System.out.println("Surya weds meghana");
        }
    }
}
