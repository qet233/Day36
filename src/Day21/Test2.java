package Day21;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int[] arr={6,1,2,7,9,3,4,5,10,8,18,17,14};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }

    public static void quickSort(int[] arr,int i,int j){
        int start = i;
        int end = j;
        if(start>end){
            return;
        }
        int baseNumber = arr[i];
        while (end!=start) {
            while (true) {
                if (arr[end] < baseNumber||end<=start) {
                    break;
                }
                end--;
            }
            while (true) {
                if (arr[start]>baseNumber||end<=start){
                        break;
                    }
                start++;
            }
            int temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
        }
        int temp = arr[i];
        arr[i]=arr[start];
        arr[start]=temp;
        quickSort(arr,i,start-1);
        quickSort(arr,start+1,j);
    }
    //打印数组
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
