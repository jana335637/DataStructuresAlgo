package SI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class IsTShaped {

    // Complete the solve function below.
    static void solve(List<List<Integer>> grid) {
        for (int i = 1; i <= grid.size()/5; i++) {
            System.out.println(solve1(grid,5*i));
        }
    }

    private static String solve1(List<List<Integer>> grid,int end) {
        HashMap<Integer,Integer> xMap = new HashMap();
        HashMap<Integer,Integer> yMap = new HashMap();
        int start = end/5-1,xMid=-1,yMid=-1;
        start=start*5+(start);
        for (int i = start; i < end; i++) {
            int xCount=0,yCount=0;
            if(xMap.keySet().contains(grid.get(i).get(0)))
            {
                xCount=xMap.get(grid.get(i).get(0));
                if(xCount==2)
                {
                    xMid=grid.get(i).get(0);
                }
                xMap.put(grid.get(i).get(0),++xCount);
            }
            else{
                xMap.put(grid.get(i).get(0),1);
            }
            if(yMap.keySet().contains(grid.get(i).get(1)))
            {
                yCount=yMap.get(grid.get(i).get(1));
                if(yCount==2)
                {
                    yMid=grid.get(i).get(1);
                }
                yMap.put(grid.get(i).get(1),++yCount);
            }
            else{
                yMap.put(grid.get(i).get(1),1);
            }
        }
        boolean up=false,below=false,left=false,right=false;
        if(xMid!=-1 && yMid!=-1){
            for (int i = start; i < end; i++) {
                if(grid.get(i).get(0)==xMid && (grid.get(i).get(1)==yMid+1)){
                    up=true;
                }
                if(grid.get(i).get(0)==xMid && (grid.get(i).get(1)==yMid-1)){
                    below=true;
                }
                if(grid.get(i).get(0)==xMid-1 && (grid.get(i).get(1)==yMid)){
                    left=true;
                }
                if(grid.get(i).get(0)==xMid+1 && (grid.get(i).get(1)==yMid)){
                    right=true;
                }
            }
            if(up && below)
            {
                boolean left1=false,right1=false,left2=false,right2=false;
                for (int i = start; i < end; i++) {
                    if(grid.get(i).get(0)==xMid-2 && (grid.get(i).get(1)==yMid)){
                        left1=true;
                    }
                    if(grid.get(i).get(0)==xMid-1 && (grid.get(i).get(1)==yMid)){
                        left2=true;
                    }
                    if(grid.get(i).get(0)==xMid+1 && (grid.get(i).get(1)==yMid)){
                        right1=true;
                    }
                    if(grid.get(i).get(0)==xMid+2 && (grid.get(i).get(1)==yMid)){
                        right2=true;
                    }
                }
                if((left1 && left2) || (right1 && right2))
                    return "Yes";
                else
                    return "No";
            }
            else if(left && right){
                boolean up1=false,down1=false,up2=false,down2=false;
                for (int i = start; i < end; i++) {
                    if(grid.get(i).get(0)==xMid && (grid.get(i).get(1)==yMid+1)){
                        up1=true;
                    }
                    if(grid.get(i).get(0)==xMid && (grid.get(i).get(1)==yMid+2)){
                        up2=true;
                    }
                    if(grid.get(i).get(0)==xMid && (grid.get(i).get(1)==yMid-1)){
                        down1=true;
                    }
                    if(grid.get(i).get(0)==xMid && (grid.get(i).get(1)==yMid-2)){
                        down2=true;
                    }
                }
                if((up1 && up2) || (down1 && down2))
                    return "Yes";
                else
                    return "No";
            }
            else
                return "No";
        }
        else
            return "No";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                List<List<Integer>> points = new ArrayList<>();

                IntStream.range(0, 5).forEach(i -> {
                    try {
                        points.add(
                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                        .map(Integer::parseInt)
                                        .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                solve(points);
                } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
         }
}
