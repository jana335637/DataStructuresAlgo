public class SpaceRemoval {
    public static void main(String[] args) {
        String str = "a bc def";
        char[] chars = str.toCharArray();
        int i=0,spaceCount=0;
        for (int j= 0; j < chars.length; j++) {
            if(chars[j]==' ')
            {
                j++;
                chars[i]=chars[j];
                i++;
                spaceCount++;
            }
            else{
                chars[i]=chars[j];
                i++;
            }
        }
        for (int j = 1; j <= spaceCount; j++) {
            chars[chars.length-j]='\0';
        }
        System.out.println(new String(chars));
        //removeSpaces("h ij klmn");
        //System.out.println(str.replaceAll(" ",""));
    }
    static String removeSpaces(String str){
        char[] chars = str.toCharArray();
        int i=0,spaceCount=0;
        for (int j= 0; j < chars.length; j++) {
            if(chars[j]==' ')
            {
                chars[i++]=chars[j];
            }
        }
        chars[i]='\0';
        System.out.println(new String(chars));
        return str;
    }
}
