import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        LinkedHashMap hashMap = new LinkedHashMap();
        hashMap.put("Jana",100);
        hashMap.put("Raj",200);
        hashMap.put("Ram",300);
        hashMap.put("Raghu",400);
        hashMap.put("Raji",100);
        hashMap.put("Amar",100);
        hashMap.put(1,"100");
        System.out.println(hashMap);
        System.out.println(hashMap.put("Amar",100));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.entrySet());
        for (Object entry: hashMap.entrySet()) {
            Map.Entry entry1 = (Map.Entry) entry;
            System.out.println(entry1.getKey()+":"+entry1.getValue());
            if(entry1.getKey().equals("Raj"))
                System.out.println(entry1.setValue("900"));
        }
        System.out.println(hashMap);
        HashMap hashMap1 = new HashMap();
        hashMap1.put(new Integer(10),"pawan");
        hashMap1.put(new Integer(10),"Kalyan");
        System.out.println(hashMap1);
        IdentityHashMap identityHashMap = new IdentityHashMap();
        identityHashMap.put(new Integer(10),"pawan");
        identityHashMap.put(new Integer(10),"Kalyan");
        System.out.println(identityHashMap);
        IdentityHashMap stringIdentityHashMap = new IdentityHashMap();
        stringIdentityHashMap.put("Raj","pawan");
        stringIdentityHashMap.put("Raj","Kalyan");
        System.out.println(stringIdentityHashMap);
        TreeMap<Integer, String> sortedMap = new TreeMap<Integer,String>();
        sortedMap.put(1,"jana");
        System.out.println(sortedMap.firstKey());

    }
}
