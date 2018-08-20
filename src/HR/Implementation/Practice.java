package HR.Implementation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;import java.io.*;

/**
 * Created by pillutja on 8/16/2018.
 */
public class Practice {
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        for(int i=0;i<grades.length;i++){
            if(grades[i]>=38){
                if((grades[i]+1)%5==0)
                    grades[i]+=1;
                if((grades[i]+2)%5==0)
                    grades[i]+=2;
            }
        }
        return grades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
