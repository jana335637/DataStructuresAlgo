package Java.New;

public class Dance {
    int x;
    private Dance(){
        x=6;
    }
    public static void main(String[] args) {
        Dance d = new Dance();
        System.out.println(d.x);
    }
}
