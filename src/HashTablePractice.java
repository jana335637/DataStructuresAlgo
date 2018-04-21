import java.util.Hashtable;

public class HashTablePractice {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new temp(5),"A");
        ht.put(new temp(2),"A");
        ht.put(new temp(6),"A");
        ht.put(new temp(15),"A");
        ht.put(new temp(23),"A");
        ht.put(new temp(16),"A");
        System.out.println(ht);
    }
}

class temp{
    int hashCode;
    temp(int hashCode)
    {
        this.hashCode=hashCode;
    }

    @Override
    public String toString() {
        return String.valueOf(hashCode);
    }
    public int hashCode(){
        return hashCode;
    }
}