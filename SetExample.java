import java.util.*;
public class SetExample {
    public static void main(String[] args)
    {
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("ABC");
        hash_Set.add("DEF");
        hash_Set.add("ABC");
        hash_Set.add("DEF");
        hash_Set.add("QWE");
 
        System.out.println(hash_Set);
    }
}