import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterate {
    public static void main(String[] args) {
        Collection a = new ArrayList();
        a.add(123);
        a.add(345);
        a.add(456);

        Iterator it = a.iterator();
        System.out.println(it.next());// it will print only first data in a list
        while (it.hasNext()){
            System.out.println(it.next());// it will iterate though all the data and print all the data.
        }

    }
}
