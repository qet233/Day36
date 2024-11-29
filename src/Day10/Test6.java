package Day10;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String[] arr1 = {"佰","拾","万","仟","佰","拾","元"};
        Scanner sc = new Scanner(System.in);
        //判断是否大于七位数
        int money;
        while (true) {
            money = sc.nextInt();
            if (money>9999999){
                System.out.println("XXX");
            } else {
                break;
            }
        }
        String moneyStr ="";
        //将int类型数字与中文大写对应
        while (money>0) {
            moneyStr=arr[money%10]+moneyStr;
            money/=10;
        }
        //补齐零
        String moneyStr1=moneyStr;
        for(int i =0;i<7-moneyStr.length();i++){
            moneyStr1="零"+moneyStr1;
        }
        //加入单位
        String moneyStr2="";
        for(int i = 0;i<arr1.length;i++){
            moneyStr2=moneyStr2+moneyStr1.charAt(i)+arr1[i];
        }
        System.out.println(moneyStr2);
    }
}
