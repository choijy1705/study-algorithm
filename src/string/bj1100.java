package string;
import java.util.*;
public class bj1100 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int cnt = 0;

        for(int i=0;i<8;i++){
            String[] s = sc.next().split("");
            for(int j=0;j<8;j++){

                if((i+j)%2 == 0){
                    if(s[j].equals("F")){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
