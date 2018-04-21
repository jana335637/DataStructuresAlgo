import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("A");
        names.add("Z");
        names.add("L");
        names.add("N");
        names.add("O");
        names.add("B");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        System.out.println(Collections.binarySearch(names,"O"));
        System.out.println(Collections.binarySearch(names,"F"));
        Comparator c = Collections.reverseOrder(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        System.out.println(c);
    }
}
