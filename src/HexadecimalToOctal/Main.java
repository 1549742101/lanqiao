package HexadecimalToOctal;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author xgl
 * 问题描述
 * 　　给定n个十六进制正整数，输出它们对应的八进制数。
 *
 * 输入格式
 * 　　输入的第一行为一个正整数n （1<=n<=10）。
 * 　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
 *
 * 输出格式
 * 　　输出n行，每行为输入对应的八进制正整数。
 *
 * 　　【注意】
 * 　　输入的十六进制数不会有前导0，比如012A。
 * 　　输出的八进制数也不能有前导0。
 *
 * 样例输入
 * 　　2
 * 　　39
 * 　　123ABC
 *
 * 样例输出
 * 　　71
 * 　　4435274
 *
 * 　　【提示】
 * 　　先将十六进制数转换成某进制数，再由某进制数转换成八进制。
 */
public class Main {
    public static void main(String[] args) {
        int n;
        String [] sixty;
        n=Integer.parseInt(new Scanner(System.in).nextLine());
        sixty=new String[n];
        if(n>0&&n<=10){
            for (int i = n-1; i >=0; i--) {
                sixty[i]=new Scanner(System.in).nextLine();
            }
        }
        for (int i = sixty.length-1; i >=0; i--) {
            System.out.println(yu(Ten(sixty)[i]));
        }
    }
    static BigInteger[] Ten(String[] sixty){
        BigInteger[] t;
        t=new BigInteger[sixty.length];
        for (int i = sixty.length-1; i >=0 ; i--) {
            int sit=16;
            char[] nums=sixty[i].toCharArray();
            t[i]=BigInteger.valueOf(re(nums[nums.length-1]));
            for (int j = nums.length-2; j >=0; j--) {
                t[i]=t[i].add(BigInteger.valueOf(re(nums[j])*sit));
                sit*=16;
            }
        }
        return t;
    }
    static int re(char a){
        switch (a){
            case '0':a=0;break;
            case '1':a=1;break;
            case '2':a=2;break;
            case '3':a=3;break;
            case '4':a=4;break;
            case '5':a=5;break;
            case '6':a=6;break;
            case '7':a=7;break;
            case '8':a=8;break;
            case '9':a=9;break;
            case 'A':a=10;break;
            case 'B':a=11;break;
            case 'C':a=12;break;
            case 'D':a=13;break;
            case 'E':a=14;break;
            case 'F':a=15;break;
            default:break;
        }
        return a;
    }
    static String yu(BigInteger i){
        String strn="";
        while (!i.equals(BigInteger.ZERO)){
            strn=i.remainder(BigInteger.valueOf(8))+strn;
            i=i.divide(BigInteger.valueOf(8));
        }
        return strn;
    }
}
