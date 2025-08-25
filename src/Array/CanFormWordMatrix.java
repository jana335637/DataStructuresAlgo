package Array;

import java.util.ArrayList;
import java.util.List;

public class CanFormWordMatrix {
    public static void main(String[] args) {
        char[][] grid = {{'A', 'B', 'C', 'E'},{'S', 'F', 'C', 'E'},{'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean found=false;
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==word.charAt(0)){
                    found=true;
                    System.out.println(canFormWord(grid, word.substring(1), i,j));
                    break;
                }
            }
            if(found) break;
            //N*N + N*N
        }
    }
    static boolean canFormWord(char[][] m, String remWord, int i, int j){
        if(m.length==0) return false;
        if(remWord.length() ==0 ) return true;
        m[i][j]='1';
        char c = remWord.charAt(0);
        List<List<Integer>> possibleIndexes = new ArrayList<>();
        List<Integer> temp = new ArrayList<Integer>();
        boolean found = false;
        if(i>=1){
            if(m[i-1][j]==c){
                temp = new ArrayList<Integer>();
                temp.add(i-1);
                temp.add(j);
                possibleIndexes.add(temp);
                found=true;
            }
        }
        if(i<m.length-1){
            if(m[i+1][j]==c){
                temp = new ArrayList<Integer>();
                temp.add(i+1);
                temp.add(j);
                possibleIndexes.add(temp);
                found=true;
            }
        }
        if(j<m[0].length-1){
            if(m[i][j+1]==c){
                temp = new ArrayList<Integer>();
                temp.add(i);
                temp.add(j+1);
                possibleIndexes.add(temp);
                found=true;
            }
        }
        if(j>=1){
            if(m[i][j-1]==c){
                temp = new ArrayList<Integer>();
                temp.add(i);
                temp.add(j-1);
                possibleIndexes.add(temp);
                found=true;
            }
        }
        if(!found && remWord.length() >= 1){
            return false;
        }
        for(List<Integer> list : possibleIndexes ){
            if(canFormWord(m, remWord.substring(1), list.get(0), list.get(1))){
                return true;
            }
        }
        return false;
    }
}
