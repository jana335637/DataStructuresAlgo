package Array;

public class RomanToInteger {
    public int romanToInt(String s) {
        int n=s.length();
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            boolean done=false;
            if(i<=n-2){
              if(s.charAt(i)=='I' && s.charAt(i+1)=='V'){
                  sum+=4;
                  i++;
                  done=true;
              }
              if(s.charAt(i)=='I' && s.charAt(i+1)=='X'){
                  sum+=9;
                  i++;
                  done=true;
              }
              if(s.charAt(i)=='X' && s.charAt(i+1)=='L'){
                  sum+=40;
                  i++;
                  done=true;
              }
              if(s.charAt(i)=='X' && s.charAt(i+1)=='C'){
                  sum+=90;
                  i++;
                  done=true;
              }
              if(s.charAt(i)=='C' && s.charAt(i+1)=='D'){
                  sum+=400;
                  i++;
                  done=true;
              }
              if(s.charAt(i)=='C' && s.charAt(i+1)=='M'){
                  sum+=900;
                  i++;
                  done=true;
              }
            }
            if(!done){
                switch (s.charAt(i)) {
                    case 'I':
                        sum+=1;
                        break;
                    case 'V':
                        sum+=5;
                        break;
                    case 'X':
                        sum+=10;
                        break;
                    case 'L':
                        sum+=50;
                        break;
                    case 'C':
                        sum+=100;
                        break;
                    case 'D':
                        sum+=500;
                        break;
                    case 'M':
                        sum+=1000;
                        break;
                    default:
                        break;
                }
            }
        }
        return sum;
    }
}
