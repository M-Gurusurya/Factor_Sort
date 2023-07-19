import java.util.*;

public class FactorSort {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for (int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        factorCount(array,size);
    }
    public static void factorCount(int array[],int size)
    {
        ArrayList<Integer> al=new ArrayList<>();
        int fact_array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            for(int j=1;j<=array[i];j++)
            {
                 if(array[i]%j==0)
                {
                    fact_array[i]++;
                }
            }
            al.add(fact_array[i]);
        }
        for(int i=0;i<size;i++)
        {
            int min= Collections.min(al);
            int pos=al.indexOf(min);
            System.out.print(array[pos]+" ");
            al.set(pos,Integer.MAX_VALUE);
        }
    }
}
