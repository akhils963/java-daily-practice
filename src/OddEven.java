import  java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter A number that needs to validated");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Number is Even");
        }
        else
            System.out.println("Number is Odd");
    }
}
