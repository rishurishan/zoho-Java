import java.util.*; 
public class LL {
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("X");
        ll.add("Y");
        ll.addLast("Z");
        ll.addFirst("P");
        ll.add(2, "R");
        System.out.println(ll);
        ll.remove("Y");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}   

