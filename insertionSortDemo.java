import java.util.Arrays;
public class insertionSortDemo {
    public static void main(String[] args){
        int[] a = {2,8,9,6,3,-4,0,7,5,1};
        // int[] a = {2};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void insertionSort(int[] a){
        if(a.length < 2){
            return;
        }
        for(int i = 1; i < a.length; i++){
            int temp = a[i];
            int j;
            for(j = i - 1; j >= 0 && a[j] > temp; j--){
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
    }
}
