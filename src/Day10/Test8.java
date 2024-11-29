package Day10;

public class Test8 {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        StringBuilder sb =new StringBuilder();
        sb.append("[");
        for (int i=0;i<arr.length;i++){
            if (i+1==arr.length) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        System.out.println(sb);
    }
}
