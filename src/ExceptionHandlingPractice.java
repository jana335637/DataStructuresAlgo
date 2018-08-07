/**
 * Created by pillutja on 4/13/2018.
 */
public class ExceptionHandlingPractice {
    public static void main(String[] args) {
        try {
            //method1();
            System.out.println(returnMethod());
           // new TryException();
            System.out.println("jana".substring(1,-1));
            int[] a = {1,2,3,5};
           /* System.out.println(a[-1]);  -- throws exception*/
            return;
        }
        catch(Exception e)
        {
            System.out.println("catch block");
            e.printStackTrace();
        }
        catch (Error error){
            System.out.println("Error handled");
        }
        finally {
            System.out.println("Final block");
        }
        System.out.println("Regular flow");
    }
    static void method1(){
        method2();
    }
    static void method2(){
       throw new Error();
    }
    static int returnMethod() {
        int result=0;
        result=18/0;
/*
        try{
            result=18/0;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block of return Method");
        }
*/
        return result;
    }
}

