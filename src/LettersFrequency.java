import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
/**
 * Created by pillutja on 4/14/2018.
 */
public class LettersFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        HashMap<Character,Integer> frequencyMap = new HashMap<>();
        int length = string.length();
        char c;
        for (int i = 0; i < length ; i++) {
            c = string.charAt(i);
            if(frequencyMap.containsKey(c))
                frequencyMap.put(c, frequencyMap.get(c)+1);
            else
                frequencyMap.put(c,1);
        }
        for (char c1: frequencyMap.keySet()) {
            System.out.println(c1 +":" + frequencyMap.get(c1));
        }
        for (int i = 0; i < length ; i++) {
            if(frequencyMap.get(string.charAt(i)) ==1){
                System.out.println("First non key:"+string.charAt(i));
                break;
        }}
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 30 ; i++) {
            numbers.add(i);
        }
        numbers.add(22);
        for (int i: numbers) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i < numbers.size(); i++) {
            List<Integer> numbers1 = new ArrayList<>();
            numbers1.addAll(numbers);
            List<Integer> tempArray = numbers1;
            tempArray.remove(i);
            for (int j: tempArray) {
                System.out.print(j+" ");
            }
            System.out.println();
            for (int x: numbers) {
                System.out.print(x+" ");
            }
            System.out.println();
            if(tempArray.contains(numbers.get(i)))
                System.out.println(numbers.get(i));;
        }
    }
}
