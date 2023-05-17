import java.util.Arrays;
public class bubbleSortDemo{
    public static void main(String[] args){
        int[] a = {2,8,9,6,3,-4,0,7,5,1};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSort(int[] a){
        for(int i = a.length-1; i >= 1; i--){
            boolean allSorted = true; //增進效能用
            for(int j = 0; j < i; j++){
                if(a[j] > a[j+1]){
                    swap(a, j, j+1);
                    allSorted = false; //增進效能用
                }
            }
            //增進效能用。若在進行此內層迴圈的過程中完全沒有發生數值交換的情形，
            //則可以判定陣列中的數值已經整齊排列完畢，因此可以提前脫離
            if(allSorted == true)break; 
        }
    }
    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
