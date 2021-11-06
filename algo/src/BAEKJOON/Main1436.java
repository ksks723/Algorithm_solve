package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1436 {
        public static void main(String[] args) throws IOException {
            BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(re.readLine());
            int title = 665;
            while(N > 0){
                if(Integer.toString(++title).contains("666")){
                    --N;
                }
            }
            System.out.println(title);
        }
}
