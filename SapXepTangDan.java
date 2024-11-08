import java.util.Arrays;
import java.util.Scanner;

public class SapXepTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap gia tri so "+(i+1));
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Mang sau khi sap xep tang dan la: ");
        for ( int num : arr){
            System.out.print(num+ " ");
        }
    }
}
