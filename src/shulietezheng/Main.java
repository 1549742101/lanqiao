package shulietezheng;


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt (sc.nextLine());
        if (n >=1&&n<=10000) {
            String m = sc.nextLine();
            String[] mn = m.split(" ");
            if (mn.length!=n){
                return;
            }
            int min=Integer.parseInt(mn[0]),max=Integer.parseInt(mn[0]),sum=0;
            for (int i = 0; i < n; i++) {
                min=min<Integer.parseInt(mn[i])?min:Integer.parseInt(mn[i]);
                max=max>Integer.parseInt(mn[i])?max:Integer.parseInt(mn[i]);
                sum+=Integer.parseInt(mn[i]);
            }
            System.out.println(max);
            System.out.println(min);
            System.out.println(sum);
        }


    }
}
