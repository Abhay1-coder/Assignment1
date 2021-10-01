import java.util.Collection;
import java.util.*;
public class CollectiosDemo {
    public static void main(String [] args){
        Collection a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        Iterator it = a.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
