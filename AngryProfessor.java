import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i++){
            int n = in.nextInt();
            int threshold = in.nextInt();
            in.nextLine();
            int count = 0;
            String[] a = in.nextLine().split(" ");
            for(int j = 0 ; j < n ; j++){
                if(Integer.parseInt(a[j]) <= 0){
                    count++;
                }
            }
            if(count >= threshold){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }    
        }
        in.close();
    }
}
