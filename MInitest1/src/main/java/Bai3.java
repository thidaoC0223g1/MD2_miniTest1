import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao do dai cua mang");
        int leng= input.nextInt();
        int [] ar1= new int [leng];
        for( int i=0;i<ar1.length; i++){
            System.out.println("nhap vao phan tu thu " +(i+1));
            ar1[i]=input.nextInt();
        }
        System.out.println("mang cua nhap vao la ");
        System.out.println(Arrays.toString(ar1));
    }
}
