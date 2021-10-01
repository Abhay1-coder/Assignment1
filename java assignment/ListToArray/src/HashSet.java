import java.util.Set;

public class HashSet {
    public static void main(String [] args){
        //set
        Set <Integer> s = new java.util.HashSet<>();//only unique element
        s.add(100);
        s.add(200);
        s.add(1000);
        System.out.println(s);
        if(s.contains(100))
            System.out.println("100 is present");
        else
            System.out.println("100 is not present");
        s.remove(1);
        System.out.println("elements after deleating index 1 element "+ s);


    }
}
