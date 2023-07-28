import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so dien: ");
        int a = scanner.nextInt();
        int td = 0;
        if (a<= 100){
            td=a*1000;
            System.out.println("Tien dien: "+td+" VND");
        } else if (a>100 || a<= 150) {
            td = 100000+(a-100)*1500;
            System.out.println("Tien dien: "+td+" VND");
        }else {
            td = 175000+2000*a;
            System.out.println("Tien dien: "+td+" VND");
        }

    }
}