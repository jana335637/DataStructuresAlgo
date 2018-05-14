import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("jana");
        strings.add("ram");
        for (int i = 0; i < 6; i++) {
            strings.add("jana");
        }
        for (int i = 0; i < 6; i++) {
            strings.add("raj");
        }
        for (int i = 0; i < 6; i++) {
            strings.add("abc");
        }
        HashMap<String,Integer> frequencyMap = new HashMap<>();
        for (String name: strings) {
            if(frequencyMap.get(name)!=null)
                frequencyMap.put(name,frequencyMap.get(name)+1);
            else
                frequencyMap.put(name,1);
        }
        for (String name:frequencyMap.keySet()) {
            System.out.println(name+"---->"+frequencyMap.get(name));
        }
        TreeSet<String> sortedStrings = new TreeSet<String>(frequencyMap.keySet());
        HashMap<Integer,ArrayList<String>> finalMap = new HashMap<>();
        for (String name:sortedStrings) {
            if(finalMap.get(frequencyMap.get(name))!=null){
                ArrayList<String> existingList = finalMap.get(frequencyMap.get(name));
                existingList.add(name);
                finalMap.put(frequencyMap.get(name),existingList);
            }
            else {
                ArrayList<String> newArrayList = new ArrayList<>();
                newArrayList.add(name);
                finalMap.put(frequencyMap.get(name),newArrayList);
            }
        }
        System.out.println();
        for (int frequency:finalMap.keySet()) {
            System.out.println(frequency+"---->"+finalMap.get(frequency));
        }
        TreeSet<Integer> sortedFrequeny = new TreeSet<>(Collections.reverseOrder());
        sortedFrequeny.addAll(finalMap.keySet());
        LinkedHashMap<Integer,ArrayList<String>> latestMap = new LinkedHashMap<>();
        for (int number: sortedFrequeny) {
            latestMap.put(number,finalMap.get(number));
        }
        System.out.println();
        for (int frequency:latestMap.keySet()) {
            System.out.println(frequency+"---->"+latestMap.get(frequency));
        }
    }
}
/*
class NameComparator extends Comparable<>{

}
*/
