package Day05;

import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] arr = new int[10];
        int [] brr = new int[10];
        for (int i = 0;i<arr.length;i++){
            arr[i]=r.nextInt(10);
        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int left=0;
        int right=arr.length-1;
        for (int i = 0 ; i<brr.length;i++) {
            if (arr[i] % 2 == 0) {
                brr[right]=arr[i];
                right--;
            } else {
                brr[left]=arr[i];
                left++;
            }
        }
        System.out.println();
        for (int i = 0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
