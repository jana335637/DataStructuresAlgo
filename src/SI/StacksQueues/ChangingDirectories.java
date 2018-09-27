package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ChangingDirectories {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            changeDirections();
            System.out.println();
        }
    }
    static void changeDirections() throws Exception{
        String s =br.readLine();
        int n = Integer.parseInt(s),top=-1;
        ArrayList<String> pathsStack= new ArrayList<>();
        while(n>0){
            String command = br.readLine();
            if("pwd".equals(command)){
                System.out.print("/");
                if(top!=-1){
                    for (int i = 0; i <= top; i++) {
                        System.out.print(pathsStack.get(i)+"/");
                    }
                }
                System.out.println();
            }
            else {
                if(command.trim().length()==4){
                    top=-1;
                    pathsStack=new ArrayList<>();
                }
                else{
                    int start=3;
                    if(command.charAt(start)=='/'){
                        pathsStack=new ArrayList<>();
                        start++;
                        top=-1;
                    }
                    String[] folders = command.substring(start,command.length()).split("/");
                    for (int i = 0; i < folders.length; i++) {
                        if(folders[i].equals("..") && top>-1)
                            top--;
                        else{
                            if((top+1)>=0 && (top+1)<pathsStack.size())
                                pathsStack.set(++top,folders[i]);
                            else{
                                top++;
                                pathsStack.add(folders[i]);
                            }
                        }
                    }
                }
            }
            n--;
        }
    }
}
