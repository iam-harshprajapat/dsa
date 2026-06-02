public class SelectionSort {
    public static void main(String[] args) {
        int x[]={20,-54,0,68,100,-8,10,24,665,45,-8};
        selectionSort(x);
        print(x);
    }

    public static void selectionSort(int x[])
    {
        for(int e=0, si=e; e<x.length-1; e++){
            for(int f=e+1; f<x.length;f++)
            {
                if(x[f]<x[si])si=f;
            }
            swap(x, e,si);
        }
    }
