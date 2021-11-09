package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1181 {
        public static void main(String[] args) throws IOException {
            BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(re.readLine());
            String[] words = new String[number];
            for(int i = 0; i<number; i++)  {
                words[i] = re.readLine();
            }

        }
}
