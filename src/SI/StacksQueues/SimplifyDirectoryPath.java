package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SimplifyDirectoryPath {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            String s = br.readLine();
            System.out.println(simplifyPath(s));
            System.out.println();
        }
    }

    static String simplifyPath(String A) {
        int top = -1;
        ArrayList<String> pathsStack = new ArrayList<>();
        String command = A;
        String[] folders = command.substring(1,command.length()).split("/");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < folders.length; i++) {
            if (folders[i].equals("..") && top > -1)
                top--;
            else if(!folders[i].equals(".") && !folders[i].equals("..") && !folders[i].equals("/") && !folders[i].equals("")){
                if ((top + 1) >= 0 && (top + 1) < pathsStack.size())
                    pathsStack.set(++top, folders[i]);
                else {
                    top++;
                    pathsStack.add(folders[i]);
                }
            }
        }
        sb.append("/");
        if (top != -1) {
            for (int i = 0; i <= top; i++) {
                sb.append(pathsStack.get(i) + "/");
            }
        }
        if(sb.length()>1)
            sb.replace(sb.length()-1,sb.length(),"");
        return sb.toString();
    }
}
