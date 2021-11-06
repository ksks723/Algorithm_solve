import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main10818 {
        public static void main(String[] args) throws IOException {
            BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(re.readLine());
            String[] array = re.readLine().split(" ");

            int[] ar = new int[number];
            for(int i = 0; i< number ; i++){
                ar[i] = Integer.parseInt(array[i]);
            }

            Arrays.sort(ar);

            System.out.println(ar[0] + " " + ar[number-1]);

        }
}
