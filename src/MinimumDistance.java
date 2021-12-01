import java.util.*;
import java.lang.Math;

public class MinimumDistance {
    public static void main(String[] args){
        int ans = -1;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] intArray = new int[n];

        for (int i=0; i<intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }

        for (int i=0; i<intArray.length; i++) {
            for (int j=i+1; j<intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                  if (ans == -1 || j - i < ans) {
                        ans = Math.abs(i - j);
                   }
                }
            }

        }
        System.out.println(ans);

    }

}
