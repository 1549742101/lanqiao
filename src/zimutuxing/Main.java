package zimutuxing;
/**
 * @author xgl
 * 问题描述
 * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
 *
 * ABCDEFG
 *
 * BABCDEF
 *
 * CBABCDE
 *
 * DCBABCD
 *
 * EDCBABC
 *
 * 这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
 *
 * 输入格式
 * 输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
 * 输出格式
 * 输出n行，每个m个字符，为你的图形。
 * 样例输入
 * 5 7
 * 样例输出
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * 数据规模与约定
 * 1 <= n, m <= 26。
 */
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] num=sc.nextLine().split(" ");
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str1="ZYXWVUTSRQPONMLJKIHGFEDCB";
        if (num.length!=2){return;}
        String result="";
        int n = Integer.parseInt(num[1]);
        int m = Integer.parseInt(num[0]);
        if (m>26||n<1){return;}
        for (int i = 0; i < m; i++) {
            result=str1.substring(str1.length()-i)+str.substring(0,n-i);
            System.out.println(result);
        }
    }
}
