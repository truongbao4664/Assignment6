import java.util.Scanner;

public class Tinhtongvatrungbinhcuamang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int tong = 0;
        double average = 0;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap gia tri phan thu "+(i+1));
            arr[i]=sc.nextInt();


        }

        for (int i = 0; i < n; i++){


            tong +=arr[i];

        }
        average = (double) tong/n;
        System.out.println("tong cua mang la: "+tong);
        System.out.println("Trung binh cong cua mang la: "+average);

    }
}
