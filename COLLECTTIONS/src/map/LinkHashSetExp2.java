import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSetExp2 {
    public static void main(String[] args) {
        
        Set<String> LinkHashSet = new LinkedHashSet<String>();
        LinkHashSet.add("Java");
        LinkHashSet.add("C++");
        LinkHashSet.add("Java");
        LinkHashSet.add("PHP");

        for ( String str : LinkHashSet){
            System.out.println(str);
        }
    }
}
