import java.util.LinkedHashMap;

public class VowelsRemoval {
    public static void main(String[] args) {
        String s="THE GRASS IS ALWAYS GREEN";
        char[] chars = s.toCharArray();
        char[] chars1 = new char[chars.length];
        int j=0;
        for (int i=0;i<chars.length;i++) {
            if (!(chars[i] =='A' || chars[i]=='E'||  chars[i]=='I'  || chars[i]=='O' || chars[i]=='U')){
                chars1[j]=chars[i];
                j++;
            }
        }
        System.out.println(new String(chars1)+chars1.length);
        LinkedHashMap<CustomizedCharacter,Integer> stringWithOutVowels = new LinkedHashMap<>();
        for (char ch: chars) {
            CustomizedCharacter customizedCharacter = new CustomizedCharacter();
            customizedCharacter.ch=ch;
            stringWithOutVowels.put(customizedCharacter,1);
        }
        for(CustomizedCharacter customizedCharacter:stringWithOutVowels.keySet()){
            if (!(customizedCharacter.ch =='A' || customizedCharacter.ch=='E'||  customizedCharacter.ch=='I'  || customizedCharacter.ch=='O'
                    || customizedCharacter.ch=='U')){
            System.out.print(customizedCharacter.ch);
        }
    }
}
}
class CustomizedCharacter {
    char ch;
   /* public boolean equals(Object o){
        char ch1 = ((CustomizedCharacter)o).ch;
        if ((ch =='A' || ch=='E'||  ch=='I'  || ch=='O' || ch=='U')){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        if ((ch =='A' || ch=='E'||  ch=='I'  || ch=='O' || ch=='U')){
            return 0;
        }
        return 1;
    }*/
}
