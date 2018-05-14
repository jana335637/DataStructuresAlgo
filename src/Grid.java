public class Grid {
    public static void main(String[] args) {
        int n=16,firstColumn=1,lastColumn = (n/4)+1,nextNumber = (n/4)+1;
        for(int i=1;i<=((n/4)+1);i++){
            System.out.print(i);
            System.out.print("*");
        }
        System.out.println();
        for (int j=0;j<=lastColumn-3;j++)
        {
            for(int i=1;i<=(lastColumn);i++)
            {
                if( i== firstColumn)
                    System.out.print(n--);
                else if(i==(lastColumn))
                    System.out.print(++nextNumber);
                else
                    System.out.print("**");
            }
            System.out.println();
        }
        for(int i=1;i<=(lastColumn);i++){
            System.out.print(n--);
            System.out.print("*");
        }
/*
        for (int i=n,j=(n/4)+2;i<)
*/

//        System.out.print();
    }
}
