

/**
 * list18
 */
import java.util.ArrayList;
public class Iterator {

    public static void main(String[] args) {
        ArrayList<Integer> arrListFloat = new ArrayList<>();
        arrListFloat.add(0);
        arrListFloat.add(7);
        arrListFloat.add(1);
        arrListFloat.add(9);

        System.out.println("cac phan tu co trong arrListInteger la :");
    for(int number : arrListFloat){
        System.out.println(number + "\t");
    }
    }
}