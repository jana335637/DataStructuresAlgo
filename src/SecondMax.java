public class SecondMax {
    public static void main(String[] args) {
        System.out.println("helo World!");
        int[] array = {6,9,7,8,3,10,11,17,16,20,18,19};
        int firstMax = array[0],secondMax = array[0],temp;
        for (int i = 1; i < array.length; i++) {
            if(firstMax<array[i]){
                secondMax=firstMax;
                firstMax=array[i];
            }
            if(secondMax<array[i] && firstMax!=array[i])
                secondMax=array[i];
        }
        System.out.println("First Max:"+firstMax+" Second Max:"+secondMax);
    }
}
