import java.util.Scanner;

class Hello
{



    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
       

System.out.println("Enter the Name: ");
String name =sc.nextLine();

System.out.println("Enter the age: ");
int age = sc.nextInt();
sc.nextLine();
System.out.println("Enter the Address: ");
String address =sc.nextLine();

System.out.println("The name you Enter is: "+name);
System.out.println("The age you Enter is :"+age);
System.out.println("The Address you Enter is :"+address);
  
sc.close();



    }
}