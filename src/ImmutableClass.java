import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClass {
    private final int id;
    private final String name;
    private final HashMap<Integer,String> names= new HashMap<>();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<Integer, String> getNames() {
        return names;
    }

    public ImmutableClass(int id, String name, HashMap<Integer,String> hashMap){
        this.id = id;
        this.name = name;
        Iterator iterator = hashMap.keySet().iterator();
        while(iterator.hasNext())
        {

            int key = (int)iterator.next();
            names.put(key,hashMap.get(key));
        }
    }
}

class Main1{
    public static void main(String[] args) {
        HashMap<Integer, String> h1 = new HashMap<Integer,String>();
        h1.put(1, "first");
        h1.put(2, "second");

        String s = "original";

        int i=10;

        ImmutableClass ce = new ImmutableClass(i,s,h1);
        //Lets see whether its copy by field or reference
        System.out.println(s==ce.getName());
        System.out.println(h1 == ce.getNames());
        //print the ce values
        System.out.println("ce id:"+ce.getId());
        System.out.println("ce name:"+ce.getName());
        System.out.println("ce testMap:"+ce.getNames());
        //change the local variable values
        i=20;
        s="modified";
        h1.put(3, "third");
        //print the values again
        System.out.println("ce id after local variable change:"+ce.getId());
        System.out.println("ce name after local variable change:"+ce.getName());
        System.out.println("ce testMap after local variable change:"+ce.getNames());
    }
}
