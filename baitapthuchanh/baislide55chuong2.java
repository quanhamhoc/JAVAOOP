/**
 * baislide55
 */
public class baislide55 {

    public static void main(String[] args) {
        System.out.println("cac so chia het cho 5 la: ");
  for (int i = 0; i <= 20; i++) {
//nếu i không chia hết cho 5 thì quay lại vòng lặp for
     if (i % 5 != 0) {
            continue;
        }
  System.out.println(i);
    }

    }
}