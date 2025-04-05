import java.util.Scanner;

public class Basics {

     public static void main(String[] args) {
         System.out.println("Hello, Enter your Name");
         Scanner sc = new Scanner(System.in);
         String name = sc.nextLine();
         System.out.println(" Hey "+name+ " How are you today");
         System.out.println("Lets start wby adding two Numbers");

         int a, b;

         System.out.println("Enter 2 Numbers");
         a= sc.nextInt();
         b= sc.nextInt();
         System.out.println("Your sum is " + (a+b));
         System.out.println("Enter Radius of the circle");
         double r= sc.nextDouble();

         area(r);

    }

    public static void area (double R){

        System.out.println("Area of the circle " + ((Math.PI*R*R)) );

    }
}
