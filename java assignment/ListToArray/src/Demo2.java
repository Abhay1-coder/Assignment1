import java.util.ArrayList;
import java.util.List;
public class Demo2 {
    public static void main(String [] args){
       List c = new ArrayList<Integer>();
        c.add(123);
        c.add(345);
        c.add(456);
        System.out.println(c);
        Integer[] a = new Integer[c.size()];
        a = (Integer[]) c.toArray(a);

        for(Integer it : a)
            System.out.println(it);


    }
}
