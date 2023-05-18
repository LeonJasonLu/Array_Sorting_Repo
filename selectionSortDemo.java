import java.util.Arrays;
public class selectionSortDemo {
    public static void main(String[] args){
        int[] a = {2,8,10,6,3,-4,0,7,5,1};
        // int[] a = {2};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void selectionSort(int[] a){
        if(a.length < 2){
            return;
        }
        for(int i = a.length - 1; i >= 1; i--){
            int maxIndex = i;
            for(int j = i -1; j >= 0; j--){
                if(a[j] > a[maxIndex]){
                    maxIndex = j;
                }
            }
            swap(a, maxIndex, i);
        }
    }
    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
