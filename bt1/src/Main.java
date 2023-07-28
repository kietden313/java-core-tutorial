import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap 1 so bat ky: ");
            int a = scanner.nextInt();
            if (a==50) {
                System.out.println("Nhap thanh cong!!!");
                break;
            }
            i++;
        } while (i != 5);
        if (i==5) {
            System.out.println("NHAP THAT BAI");
        }
    }
}