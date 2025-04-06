import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
             String[] test= {"ak","ak","as","pc","bk"};

             for (int i =0; i< test.length-1;i++){
                 String temp =test[i];
                 for (int j =i+1; j< test.length-1;j++) {
                     if (temp.equals(test[j]))
                         System.out.println(temp);
                 }
             }
    }
}
