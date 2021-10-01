import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String [] args){
        Collection a = new ArrayList();
        a.add(123);
        a.add(345);
        a.add(456);
        int len = a.size();
        System.out.println("length of arraylist is:" + len);

    }
}
