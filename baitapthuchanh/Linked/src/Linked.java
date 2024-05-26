import java.util.LinkedList;

public class Linked {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        System.out.println("vi du su dung phuong thuc cua addA11()");
        System.out.println("----------------------------------------");
    LinkedList<String> listA =new LinkedList<String>();
    listA.addAll(list);
    System.out.println("listA :");
    showList(listA);
    System.out.println("\n vi du su dung phuong thuc retainAll");
    System.out.println("-----------------------------------------");
    LinkedList<String> listB = new LinkedList<String>();
    listB.add("Java");
    listA.retainAll(listB);
    System.out.println("list :");
    showList(list);

    }
    public static void showList(LinkedList<String> list) {
        for ( String obj : list){
            System.out.println("\t" + obj +",");
        }
        System.out.println();

    }
}