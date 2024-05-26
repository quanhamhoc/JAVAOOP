package PERSION;

import java.util.Scanner;

public class persion {
    public static void main(String[] args) {
        persion ps = new persion();

        ps.nhapthongtin();
        ps.xuatthongtin();
        
    }

    public class persion{
        public String name;
        public int id;

    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten :");
        name = sc.nextLine();
        System.out.println("nhap id cua ban");
        id =scanner.nextInt();
    }
    
    public void xuatthongtin(){
        System.out.println("ten cua ban" +name);
        System.out.println("ma id cua ban"+ id);
    }
    }


    
}
