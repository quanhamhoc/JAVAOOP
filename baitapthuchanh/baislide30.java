import java.util.Scanner;

/**
 * bai30
 */
public class baislide30 {

    public static void main(String[] args){
        int n, soDu, tong = 0;
 Scanner scanner = new Scanner(System.in);
 System.out.println("Nhap vao so nguyen duong: ");
  n = scanner.nextInt();
    while (n > 0) {
        soDu = n % 10;
        n = n / 10;
        tong += soDu;
    }
 System.out.println("Tong cac chu so = " + tong);
    
}
}