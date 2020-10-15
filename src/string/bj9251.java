package string;
import java.util.*;
public class bj9251 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String a = sc.next();
        String b = sc.next();

        int[][] dp = new int[b.length()+1][a.length()+1];

        for(int i=1;i<=b.length();i++){
            for(int j=1;j<=a.length();j++){
                if(b.charAt(i-1) != a.charAt(j-1)){
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
            }
        }

        System.out.println(dp[b.length()][a.length()]);
    }
}
