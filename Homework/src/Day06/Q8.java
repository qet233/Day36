package Day06;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};

        System.out.println(Arrays.toString(fill(arr, 2, 4, 9)));
    }
    public static int[] fill(int[] arr,int fromIndex,int toIndex,int value){
        for(;fromIndex<toIndex;fromIndex++){
            arr[fromIndex] = value;
        }
        return arr;
    }
}
