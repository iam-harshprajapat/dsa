public class LinearSort {
    public static void main(String[] args) {
        int x[]={20,-54,0,68,100,-8,10,24,665,45,-8};
        linearSort(x);
        print(x);
    }

    public static void linearSort(int x[])
    {
        for(int i=0; i<x.length-1; i++)
        {
            for(int j=i+1; j<x.length; j++)
            {
                if(x[j]<x[i])swap(x,i,j);
            }
        }
    }

    public static void swap(int x[], int i, int j)
    {
        int temp=x[i];
        x[i]=x[j];
        x[j]=temp;
    }

    public static void print(int x[])
    {
        for(int num: x)
        {
            System.out.print(num+" ");
        }
    }
}