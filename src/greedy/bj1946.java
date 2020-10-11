package greedy;
import java.util.*;
public class bj1946 {
    static Scanner sc = new Scanner(System.in);
    static int t,n;
    public static void main(String[] args){
        t = sc.nextInt();

        for(int tc=0;tc<t;tc++){
            n = sc.nextInt();

            int[][] student = new int[n][2];

            for(int i=0;i<n;i++){
                student[i][0] = sc.nextInt();
                student[i][1] = sc.nextInt();

            }

            Arrays.sort(student, new Comparator<int[]>(){

                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.add(student[0][1]);
            int cnt = 1;
            for(int i=1;i<n;i++){
                cnt++;
                if(student[i][1] > pq.peek()){
                    cnt--;
                }
                pq.add(student[i][1]);

            }
            System.out.println(cnt);
        }
    }
}
