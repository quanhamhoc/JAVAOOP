import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("so nguyen co gia tri lon nhat: " + max);

        System.out.print("Nap so nguyen can xoa: ");
        int x = sc.nextInt();
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == x) {
                list.remove(i);
            }
        }

        list.sort((a, b) -> a - b);
        System.out.println("Danh sach sau khi sap xep:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        sc.close();
    }
}