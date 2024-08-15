import java.util.*;

public class Elseif {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the color of the traffic light?");
        String colour = sc.nextLine();

        if("red".equals(colour)){
            System.out.println("STOP");
        }else if("yellow".equals(colour)){
System.out.println("Get Ready");
        }
        else{
            System.out.println("Go");
        }

    }
}
