import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        // about Collection and Iterator interface -
        Collection values = new ArrayList<>();
        values.add(17);
        values.add(21);
        values.add(11);
        values.add("Nikhil");
        values.add(true);
        values.add(17.55);

        System.out.println(values);

        Iterator it = values.iterator();

        System.out.println("\nFetching values using iterator - ");
        while (it.hasNext())
            System.out.println(it.next());

        // about List interface -
        List<Integer> list = new ArrayList<>();// as we have specified Integer we can add integer values only
        // if we havent specified then it will accept things of type object i.e anything
        // Integer,String,Float

        list.add(12);
        list.add(1);
        list.add(22);
        list.add(1, 24);

        System.out.println("\nList and generics -");
        for (Integer val : list)
            System.out.println(val);
    }
}
