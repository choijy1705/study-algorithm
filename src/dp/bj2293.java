package dp;
import java.util.*;
public class bj2293 {
    static Scanner sc = new Scanner(System.in);
    static int n,k;
    public static void main(String[] args){
        n = sc.nextInt();
        k = sc.nextInt();

        int[] num = new int[n];

        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }

        long[] dp = new long[k+1];
        dp[0] = 1;

        for(int i=1;i<=k;i++){

            for(int j=0;j<n;j++){
                if(num[j]<=i){
                    dp[i] += dp[i-num[j]];
                }

            }
            //System.out.println(dp[i]);
        }

        System.out.println(dp[k]);
    }
}
