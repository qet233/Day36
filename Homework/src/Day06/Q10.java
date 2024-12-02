package Day06;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};

        System.out.println(Arrays.toString(copyOfRange(arr, 2, 4)));
    }
    public static int[] copyOfRange(int[] arr,int from, int to){
        int[] brr = new int[to - from  ];
        int count = 0;
        for (;from<to;from++){
            brr[count] =arr[from] ;
            count++;
        }
        return brr;
    }
}
