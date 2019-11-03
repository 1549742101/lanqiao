package shengmeike;



/**
 * @author xgl
 * 问题描述
 * 　　《审美的历程》课上有n位学生，帅老师展示了m幅画，其中有些是梵高的作品，另外的都出自五岁小朋友之手。老师请同学们分辨哪些画的作者是梵高，但是老师自己并没有答案，因为这些画看上去都像是小朋友画的……老师只想知道，有多少对同学给出的答案完全相反，这样他就可以用这个数据去揭穿披着皇帝新衣的抽象艺术了（支持帅老师^_^）。
 * 　　答案完全相反是指对每一幅画的判断都相反。
 * 输入格式
 * 　　第一行两个数n和m，表示学生数和图画数；
 * 　　接下来是一个n*m的01矩阵A：
 * 　　如果aij=0，表示学生i觉得第j幅画是小朋友画的；
 * 　　如果aij=1，表示学生i觉得第j幅画是梵高画的。
 * 输出格式
 * 　　输出一个数ans：表示有多少对同学的答案完全相反。
 * 样例输入
 * 3 2
 * 1 0
 * 0 1
 * 1 0
 * 样例输出
 * 2
 * 样例说明
 * 　　同学1和同学2的答案完全相反；
 * 　　同学2和同学3的答案完全相反；
 * 　　所以答案是2。
 * 数据规模和约定
 * 　　对于50%的数据：n<=1000；
 * 　　对于80%的数据：n<=10000；
 * 　　对于100%的数据：n<=50000，m<=20。
 */
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        boolean is;
        int num=0;
        for (int i=0;i<n-1;i++){
            for (int j = i+1; j < n; j++) {
                is=true;
                for (int k = 0; k <m ; k++) {
                    if (a[i][k]==a[j][k]){is=false;break;};
                }
                if (is){
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
