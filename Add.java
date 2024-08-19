import java.util.*;

public class Add {

    int a,b,c;

    int sum(int a,int b){

        c = a+b;
return c;

    }
    public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the A value: ");
int num1 = sc.nextInt();

System.out.println("Enter the B value:");
int num2 = sc.nextInt();

Add ad = new Add();
int c = ad.sum(num1, num2);



System.out.println("The Addition of the two value is: "+c);
    }
}
