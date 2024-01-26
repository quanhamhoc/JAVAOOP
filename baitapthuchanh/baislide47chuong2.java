import java.util.Scanner;

/**
 * baislide47
 */
public class baislide47 {

    public static void main(String[] args) {
        int number, sum = 0;
    Scanner scanner = new Scanner(System.in);      
    do {
     System.out.println("nhap vao so nguyen bat ky: ");
       number = scanner.nextInt();
       sum += number;//sum = sum + number;
   } while (sum < 100); 
     System.out.println("tong cac so nguyen vua nhap = "+sum);
    } }

    
