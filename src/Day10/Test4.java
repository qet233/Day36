package Day10;

public class Test4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(arrToString(arr));
    }
    public static String arrToString(int[] arr){
        String str ="[";
        for(int i = 0;i<arr.length;i++){
            if(i+1==arr.length){
                str=str+arr[i]+"]";
            } else{
                str=str+arr[i]+",";
            }
        }
        return str;
    }
}
