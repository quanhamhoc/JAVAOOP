import java.util.LinkedList;
import java.util.Scanner;

public class TrienKhai implements Person {
    
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten : ");
        hoTen = sc.next();
        System.out.print("Nhap tuoi : ");
        tuoi = sc.nextInt();
        ThemThongTin();
    }

    public void ThemThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap them thong tin khac : ");
        String themThongTin = sc.next();
        thongtinKhac.add(themThongTin);
    }

    public void SuaThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban sua lai thong tin : ");
        NhapThongTin();
    }

    public void XoaThongTin(LinkedList<Person> linkedList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien ban can xoa : ");
        String name = sc.next();
        for(int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).equals(name)) {
                linkedList.remove(i);
            }
        }
    }

    public void HienThi(LinkedList<Person> linkedList) {
        System.out.println("Ho ten : " + hoTen);
        System.out.println("Tuoi : " + tuoi);
        // Hien thi thong tin nguoi dung them
        for(String x : thongtinKhac) {
            System.out.println(x);
        }
    }

    @Override
    public void XoaThongTin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'XoaThongTin'");
    }

    @Override
    public void HienThi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'HienThi'");
    }
}