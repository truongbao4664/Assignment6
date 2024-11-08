import java.util.Scanner;

public class DemSoLanPtuXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++){
            System.out.println("Nhap phan tu so "+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println("Nhap phan tu muon tim so lan xuat hien: ");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++){
            if (arr[i]==x){
                count++;
            }
        }
        System.out.println("So lan gia tri "+x+" xuat hien la: "+count);

    }
}
