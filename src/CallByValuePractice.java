/**
 * Created by pillutja on 4/12/2018.
 */
public class CallByValuePractice {
    static int id;

    static {
        System.out.println("Static");
        String x= "jana";
        System.out.println(x);
    }

    public static void main(String[] args) {
        CallByValuePractice callByValuePractice =new CallByValuePractice();
        callByValuePractice.id = 50;
        System.out.println(callByValuePractice.id);
        callByValuePractice.change();
        System.out.println(callByValuePractice.id);
        callByValuePractice.change1(id);
        System.out.println(callByValuePractice.id);
        int[] integers = {1,2,3,4,5};
        for (int number : integers) {
            System.out.print(number);
        }
        System.out.println();
        callByValuePractice.change2(integers);
        for (int number : integers) {
            System.out.print(number);
        }
    }
    public void change(){
        this.id = 100;
    }
    public void change1(int id){
        this.id = 200;
    }
    public void change2(int[] array){
        array[0] = array[0]+array[array.length-1];
        array[array.length-1] = array[0]-array[array.length-1];
        array[0] = array[0]-array[array.length-1];
        array = null;
        System.out.println(array);
        System.out.println(new CallByValuePractice());
    }
    public void change3(Integer x,Integer y)
    {
        x=new Integer(4);
        y=new Integer(5);

    }
}

