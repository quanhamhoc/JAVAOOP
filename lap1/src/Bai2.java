import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> LinkedList = new LinkedList<Integer>();
        System.out.println(" Nhap so luong phan tu :");
        int n= sc.nextInt();
        System.out.println(" Nhap cac phan tu :");
        for(int i =0;i < n; i++){
            LinkedList.add(sc.nextInt());
        }
        int dem =0;
        int sum = LinkedList.get(0);
        for(int i =0;i < LinkedList.size();i++){
            if (LinkedList.get(i) %2 == 0) {
                dem +=dem;


                
            }
        }
    }
}
