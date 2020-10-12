package dp;
import java.util.*;
public class bj1699 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void main(String[] args){

        n = sc.nextInt();
        int[] dp = new int[n+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j*j<=i;j++){
                if(dp[i] > dp[i-j*j]+1 || dp[i] == 0){
                    dp[i] = dp[i-j*j]+1;
                }
            }
        }

        System.out.println(dp[n]);
    }
}
