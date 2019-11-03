package huiwen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        List<String> list=new ArrayList<>();
        for (int i = 1; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                for (int k = 0; k < 10 ; k++) {
                    if ((2*i+2*j+k)==n){
                        System.out.println(i+""+j+""+k+""+j+""+i);
                    }else if ((2*i+2*j+2*k)==n){
                        list.add(i+""+j+""+k+""+k+""+j+""+i);
                    }
                }
            }
        }
        for (String s:
             list) {
            System.out.println(s);
        }
    }
}
