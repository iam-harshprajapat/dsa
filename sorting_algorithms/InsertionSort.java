public class InsertionSort {
    public static void main(String[] args) {
        int x[]={20,-54,0,68,100,-8,10,24,665,45,-8};
        insertionSort(x);
        print(x);
    }

    public static void insertionSort(int x[])
    {
        for(int e=1; e<x.length; e++)
        {
            int element=x[e];
            int f=e-1;
           for(; f>=0 && x[f]>element; f--)
           {
                   x[f+1]=x[f];
           }
           x[f+1]=element;
        }
    }

    public static void print(int x[])
    {
        for(int num: x)
        {
            System.out.print(num+" ");
        }
    }
}