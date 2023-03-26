import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nhap vao ten sinh vien");
        String name =input.nextLine();
        System.out.println("nhap vao tuoi sinh vien");
        int age = input.nextInt();
        Student student = new Student(name,age);
        System.out.println("thong tin sinh vien vua nhap vao ");
        System.out.println("Ho ten: "+ student.getName());
        System.out.println("Tuoi: "+ student.getAge());
    }
}
