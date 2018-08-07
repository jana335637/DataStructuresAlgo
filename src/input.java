import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sizes=new int[3];
        for (int i = 0; i < 3; i++) {
            sizes[i]=scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(sizes[i]);
        }
    }
}
