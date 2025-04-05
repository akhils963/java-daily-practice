import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter FIrst Number");
        int a = sc.nextInt();
        System.out.println(" Enter Second NUmber");
        int b =sc.nextInt();

        System.out.println("the Original no are "+a+","+b);
        int temp=b;
        b=a;
        a=temp;
        System.out.println("the swapped no are "+a+","+b);

        System.out.println("Swapping numbers without using the third variable");
        System.out.println(" Enter FIrst Number");
        int x = sc.nextInt();
        System.out.println(" Enter Second NUmber");
        int y =sc.nextInt();

        x =x+y;
        y=x-y;
        x=x-y;

        System.out.println("Swapped Numbers are "+x+","+y);

    }
}
