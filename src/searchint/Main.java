package searchint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt (sc.nextLine());
        String m = sc.nextLine();
        String[] mn = m.split(" ");
        List<Integer> mm = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            mm.add(Integer.parseInt(mn[i]));
        }
        int num = Integer.parseInt (sc.nextLine());
        System.out.println(mm.indexOf(num)+1);
    }
}
