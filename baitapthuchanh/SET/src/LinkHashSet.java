import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSet {
    public static void main(String[] args) {
        Set<String> linkerHashSet = new LinkedHashSet<String>();
        linkerHashSet.add("java");
        linkerHashSet.add("C ++");
        linkerHashSet.add("java");
        linkerHashSet.add("PHP");

        for( String str : linkerHashSet){
            System.out.println(str);
        }
    }
}
