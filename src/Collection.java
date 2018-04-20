import java.util.*;

/**
 * Created by pillutja on 3/21/2018.
 */
public class Collection {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("jana");
        names.add("Amrutha");
        names.add(1,"Adi");
        names.set(1,"Ram");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        ArrayList l = new ArrayList();
        l.add("Jan");
        l.add(20);
        l.add(new Collection());
        System.out.println(l);
        List synNames = Collections.synchronizedList(names);
        Vector<String> vector = new Vector<>();
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Jana");
        linkedList.set(0,"Ram");
        System.out.println(vector.capacity());
        vector.add("Jana");
        System.out.println(vector.capacity());
        for (int i = 0; i < 50; i++) {
            vector.add("Raj");
        }
        System.out.println(vector.capacity());
        Stack stack =new Stack();
        stack.add("jana");
        stack.add(linkedList);
        System.out.println(stack.peek());
        System.out.println(stack.search(linkedList));
        System.out.println(stack);
        Enumeration enum1 = vector.elements();
        Iterator itr = names.iterator();
        System.out.println(itr.toString());
        ListIterator ltr = names.listIterator();
        System.out.println(ltr.next());
        System.out.println(ltr.previous());
        System.out.println("Next Index:"+ltr.nextIndex()+",Previous index:"+ltr.previousIndex());
        System.out.println(enum1.getClass().getName()+"::"+itr.getClass().getName()+"::"+ltr.getClass().getName());
        Set<String> namesSet = new HashSet<String>(names);
        System.out.println(namesSet);
    }
}
