import java.util.Scanner;

public class SimpleArithmetric {

    public static void main(String args[]){

        int a,b,c,d,e;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the A value: ");
        a=sc.nextInt();

        System.out.println("Enter the B value: ");
        b=sc.nextInt();

        System.out.println("Enter the C value: ");
        c=sc.nextInt();

        d=a*b*c;
        System.out.println("The Multiply of the value is: "+ d);
        e=a+b+c;
        System.out.println("The divide of the value is: "+e);

        System.out.println(d/e);





    }
    
}
