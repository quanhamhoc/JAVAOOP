

import java.util.ArrayList;
/**
 * list19ARRAYLIST
 */
import java.util.Iterator;
public class Iteratornext {
public static void main(String[] args) {
    ArrayList<Float> arrListFloat = new ArrayList<>();

    arrListFloat.add(0.7f);
    arrListFloat.add(7.26f);
    arrListFloat.add(1.02f);
    arrListFloat.add(9.3f);

    Iterator<Float> Interator = arrListFloat.iterator();
    System.out.println("cac phan tu co trong arrListFloat la :");
    while (Interator.hasNext()) {
        System.out.println(Interator.next() + "\t");
        
    }

}
   
    
}