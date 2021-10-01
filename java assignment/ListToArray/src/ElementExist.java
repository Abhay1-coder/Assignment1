import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ElementExist {
    public static void main(String [] args){
        ArrayList<Integer> a = new ArrayList();
        a.add(123);
        a.add(345);
        a.add(456);
        if(a.contains(123))
            System.out.println("123 is present");
        else
            System.out.println("123 is not present");
        if(a.contains(1235))
            System.out.println("123 is present");
        else
            System.out.println("123 is not present");
    }
}
