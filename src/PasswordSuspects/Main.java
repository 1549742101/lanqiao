/**
 * @author xgl
 * 问题描述
 * 　　你是一个秘密犯罪组织the Sneaky Underground Smug Perpetrators of Evil Crimes and Thefts(SUSPECT)里的电脑高手。SUSPECT最新的邪恶犯罪目标是他们最大的对手the Indescribably Clever Policemen’s Club（ICPC），一切都已经准备就绪，除了一件小事：ICPC的主机密码。
 * 　　密码仅有小写字母’a’-‘z’构成。此外，通过各种偷窥，你已经确定了密码的长度，和一些（可能重叠）密码中的子串，尽管你不清楚他们出现在密码的哪个位置。
 * 　　例如，你知道密码的长度是10个字符且你观察到了子串“hello”和“world”。那么密码一定是“helloworld”或者“worldhello”。
 * 　　问题在于这些信息是否能将密码的可能数缩减到一个合理的范围内。要回答这个问题，你的任务是写一个程序判断可能的密码的总数目，如果可能的密码数目不超过42，打印出所有可能密码。
 * 输入格式
 * 　　第一行包含两个整数N和M，分别表示密码的长度和已知的密码中子串的数量。接下来M行，每行一个密码中的已知子串。
 * 输出格式
 * 　　第一行输出Y，Y表示可能的密码的数目。如果Y不超过42，接下来按照字典序，每行一个密码，依次输出所有可能的密码。
 * 样例输入
 * 10 2
 * hello
 * world
 * 样例输出
 * 2
 * helloworld
 * worldhello
 * 样例输入
 * 10 0
 * 样例输出
 * 141167095653376
 * 样例输入
 * 4 1
 * icpc
 * 样例输出
 * 1
 * icpc
 * 数据规模和约定
 * 　　1<=N<=25，0<=M<=10，子串长度<=10，所有字符均为小写字母’a’-‘z’，输入数据保证答案不超过10^15。
 */
package PasswordSuspects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        String[] strint = sc.nextLine().split(" ");
        int m = Integer.parseInt(strint[0]);
        int n = Integer.parseInt(strint[1]);
        int result=1;
        List<String> password = new ArrayList<>();
        int lenstr = 0;//子串长度和
        String[] sub = new String[n];
        for (int i=0;i<n;i++){
            sub[i]=sc.nextLine();
            lenstr+=sub[i].length();
        }
        if (lenstr==m){
            for (int i = 1; i <= n; i++) {
                result*=i;
            }
        }
    }
}
