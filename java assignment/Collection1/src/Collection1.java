import java.util.ArrayList;
import java.util.*;
import java.util.Collection;

public class Collection1 {
    public static void main(String[] args) {

        //arraylist
        Collection val =  new ArrayList<>();
        val.add(5);
        val.add("abhay");
        System.out.println(val);


        Collection <Integer> values = new ArrayList<>();// take only integer value
        values.add(8);
        values.add(9);
        System.out.println(values);

        //list
        List <Integer> a = new ArrayList<>();// it allow dublicate value
        a.add(1);
        a.add(2);
        a.add(1,7);// it store element in key value pair.
        System.out.println(a);

        //set
        Set <Integer> s = new HashSet<>();//only unique element
        s.add(100);
        s.add(200);
        s.add(100);
        System.out.println(s);

        //tree set
        Set <Integer> d = new TreeSet<>();//get data into shorted from
        d.add(300);
        d.add(400);
        d.add(200);
        d.add(50);
        System.out.println(d);

        List <Integer> obj = new ArrayList<>();//get data into shorted from
        d.add(23457);
        d.add(23456);
        d.add(2345);
        d.add(345);


        //Iterator :- it will itrate all though the list and print
        Iterator it = a.iterator();
        System.out.println(it.next());// it will print only first data in a list
        while (it.hasNext()){
            System.out.println(it.next());// it will iterate though all the data and print all the data.
        }

        // it will print all the data from array list
        for(int i = 0; i<a.size(); i++){
            System.out.println(a.get(i));
        }

        //inhance for loop
        for(Object o :a ){
            System.out.println(o);
        }
    }

}
