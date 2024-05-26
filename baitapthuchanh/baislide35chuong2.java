import java.util.Scanner;

/**
 * baislide40
 */
public class baislide35chuong2 {

    public static void main(String[] args) {
        int firstNumber, secondNumber;
  Scanner scanner = new Scanner(System.in);
  System.out.println("nhap so thu nhat: ");
  firstNumber = scanner.nextInt();
  System.out.println("nhap so thu hai: ");
   secondNumber = scanner.nextInt();
   int minNumber = firstNumber;// gán giá trị của biến firstNumber cho minNumber
   if (firstNumber > secondNumber) 
         minNumber = secondNumber;
     System.out.println("so nho nhat trong 2 so " + firstNumber + " va "+ secondNumber+ " la " + minNumber);
       }
    }
