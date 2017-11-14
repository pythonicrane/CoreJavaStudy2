import java.util.*;
public class LinkedListTest
{
    public static void main(String... args)
    {
        List<String > a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Glora");

        System.out.println(a);
        System.out.println(b);

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bInter = b.iterator();

        while (bInter.hasNext())
        {
            if(aIter.hasNext())
                aIter.next();
            aIter.add(bInter.next());
        }
        System.out.println(a);
        a.add(0,"Hello");
        System.out.println(a);
    }
}
