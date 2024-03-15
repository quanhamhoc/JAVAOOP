import java.util.Scanner;

public class student { 
    public static void main(String[] args) {
        sinhvien sv = new student( ).new sinhvien();

        sv.nhapthongtin();
        sv.xuatthongtin();
        sv.diemtongket();

    }
    public class sinhvien {
        public String name;
        public int id;
        public float diema;
        public float diemb;
        public float diemtongket;
    

    public void nhapthongtin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ten sinh vien:");
        name = scanner.nextLine();
        System.out.println("nhap ma so sinh vien");
        id =scanner.nextInt();
        System.out.print("nhap diem A cua sinh vien do");
        diema = scanner.nextFloat();
        System.out.print("nhap diem B cua sinh vien do");
        diemb = scanner.nextFloat();
    }
    public void xuatthongtin(){
        System.out.println("ten hoc sinh" +name);
        System.out.println("ma so sinh vien"+ id);
        System.out.println(" diem A cua sinh vien"+ diema);
        System.out.println(" diem B cua sinh vien"+ diemb);

    }
    public void diemtongket(){
        diemtongket =(diema + diemb) /2;
        System.out.print("diem tong ket"+ diemtongket);
    
    }
}
}

    

    
