import java.util.*;

public class Garden {

int apple_price=20;
int apple_count;

int total_money(int apple_count){

 return (apple_price*apple_count);

}

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Apple u want: ");
        int a= sc.nextInt();

        Garden gd = new Garden();
        
        System.out.println( "The price of the Apple is: "+gd.total_money(a));

    }
}
