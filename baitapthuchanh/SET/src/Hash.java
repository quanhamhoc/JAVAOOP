import java.util.HashSet;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);

     hashSetString.add("willson");
     hashSetString.add("Nike");
     hashSetString.add("Volvo");
     hashSetString.add("Kia");
     hashSetString.add("Lenovo");
     hashSetString.add("Lenovo");
        
     System.out.println("cac phan tu torng hashsetstring :");
     System.out.println(hashSetString);
     System.err.println(" nhap phan tu can xoa :");
     name = sc.nextLine();

     if (hashSetString.contains(name)) {
        hashSetString.remove(name);
        System.out.println(" xoa thanh cong");
        System.out.println(" cac phan tu con lai trong hashSrtString");
        System.out.println(hashSetString);
     }else{
        System.out.println(" xoa khong thanh cong");
     }

    }
    
}
