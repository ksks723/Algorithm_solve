import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(re.readLine());
        int max = Integer.parseInt(re.readLine());
        for(int i =min; i< max+1; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static Boolean isPrime(int num){
        if( num < 2) {
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
