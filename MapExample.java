import java.util.*;  
public class MapExample {  
public static void main(String[] args) {  
    Map map=new HashMap();   
    map.put(2,"Mohamed");  
    map.put(1,"Rishan");  
    map.put(3,"AV");  
    map.put(4,"Malappuram");  
    Set set=map.entrySet();  
    Iterator itr=set.iterator();  
    while(itr.hasNext()){  
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+"-"+entry.getValue());  
    }  
}  
}  