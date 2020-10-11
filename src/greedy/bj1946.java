package greedy;
import java.util.*;
public class bj1946 {
    static Scanner sc = new Scanner(System.in);
    static int t,n;
    public static void main(String[] args){
        t = sc.nextInt();

        for(int tc=0;tc<t;tc++){
            n = sc.nextInt();
            int[] score = new int[n+1];

            for(int i=0;i<n;i++){
                score[sc.nextInt()] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            int cnt = 0;
            for(int i=1;i<=n;i++){
                if(score[i] < min){
                    cnt++;
                    min = score[i];
                }
            }
            System.out.println(cnt);
        }
    }
}
