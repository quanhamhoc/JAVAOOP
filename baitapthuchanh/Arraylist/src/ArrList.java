package Arraylist.src;
import java.util.ListIterator;
import java.util.ArrayList;
public class ArrList {
    public static void main(String[] args) {
        ArrayList<Character> arrListChar = new ArrayList<>();
        arrListChar.add('a');
        arrListChar.add('e');
        arrListChar.add('b');
        arrListChar.add('c');
    ListIterator<Character> listIterator = arrListChar.listIterator();
    System.out.println (" cac phan tu co trong arrListChar la :");
    while (listIterator.hasNext()){
        System.out.print(listIterator.next() + "\t");
    }
        }
    }

