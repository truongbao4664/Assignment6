import java.util.Scanner;

public class FindlargestAndsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n phan tu: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            System.out.println("Nhap gia tri "+(i+1));
            arr[i] = sc.nextInt();

        }
        int largest = arr[0];
        int smallest = arr[0];


        for (int i = 1; i<n; i++){
            if (arr[i] >largest){
                largest = arr[i];
            }
            if (arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("ptu lon nhat = "+largest);
        System.out.println("ptu nho nhat = "+smallest);
    }
}
