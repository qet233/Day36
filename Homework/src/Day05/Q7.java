package Day05;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        int[] arr ={12,14,23,45,66,68,70,77,90,91};
        int[] brr = new int[11];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = 0 ;
        for (int i = 0 ;i<=arr.length-1;i++){
            if(num>=arr[i]){
                index = i+1;
            }else{
                break;
            }
        }
        for(int i = 0;i<=brr.length-1;i++){
            if(i<index){
                brr[i]=arr[i];
            } else if (i==index) {
                brr[i]=num;
            } else{
                brr[i]=arr[i-1];
            }
        }
        for(int i = 0 ; i<=brr.length-1;i++){
            System.out.print(brr[i]+" ");
        }


    }
}
