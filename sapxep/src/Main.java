import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so phan tu cua mang: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        int arr[] = new int[size];
        int n = arr[0];

        for (int i = 0; i<size; i++) {
            System.out.println("Nhap phan tu thu "+i);
            arr[i]= scanner.nextInt();
        }
        System.out.print("Day so truoc khi sap xep: ");
        for (int i = 0; i< size;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        size = sapxep(arr, size, n);
        System.out.print("Day so sau khi sap xep: ");
        for (int i = 0; i< size;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int sapxep(int[] arr, int size, int n){

        for (int i = 0; i<size-1;i++){
            for (int j = i+1; j< size;j++){
                if(arr[i]>arr[j]){
                    n = arr[i];
                    arr[i]=arr[j];
                    arr[j]=n;
                }
            }
        }
        return size;
    }
}