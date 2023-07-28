import java.util.Scanner;

public class them {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 20; // Suc chua cua mang
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = -1;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 3;
        arr[5] = 14;
        int n = 6;

        System.out.println("Nhap so muon them");
        int x = scanner.nextInt();
        System.out.println("Nhap vi tri muon them > 0: ");
        int pos = scanner.nextInt();
        scanner.close();
        if (pos<0){
            pos = 0;
        }
        if (pos > n){
            pos = n;
        }

        System.out.print("Truoc khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Inserting key
        n = insert(arr, size, n, x, pos);

        System.out.print("\nSau khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    static int insert(int[] arr, int size, int n, int x, int pos) {
        for (int i = n+1;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos] = x;
        return n + 1; // tang so luong phan tu cua mang them 1
    }
}