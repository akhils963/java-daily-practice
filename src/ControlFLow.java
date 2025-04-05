import java.util.Scanner;

public class ControlFLow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Negative or Positive

        System.out.println("Enter a Number");
        int n = sc.nextInt();

        if(n>0)
            System.out.println("Its a Positive  Number");
        else
            System.out.println("Its an Negative  NUmber");
    }
}
