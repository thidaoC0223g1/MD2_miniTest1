import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("nhap vao mot so nguyen duong bat ki:");
        int x =input.nextInt();
        System.out.println("so nguyen to nho hon n = ");
        for (int j=0;j<x;j++){
            if(check(j)){
                System.out.println(j);
            }
        }
    }
    public  static boolean check(int n){
        if(n<2)
            return false;
        for(int i=2;i <= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
}
