import java.util.HashSet;
import java.util.Scanner;

public class Hash1 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Kia");
        hashSetString.add("Volvo");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");

        System.out.println(" cac phan tu trong hashsetString:");
        System.out.println(hashSetString);
        System.out.println(" nhap phan tu can xoa");
        name = sc.nextLine();

        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println(" xoa thanh cong!");
            System.out.println(" cac phan tu con lai trong HashSetString");
            System.out.println(hashSetString);
            
        }else{
            System.out.println(" xoa khong thanh cong");
        }
    }
}
