package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        String userInput = re.readLine();
        String[] answer = userInput.split(" ");
        for(int i =Integer.parseInt(answer[0]); i< Integer.parseInt(answer[1])+1; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static Boolean isPrime(int num){
        if( num < 2) {
            return false;
        }
        for(int i=2;i<46341&& i*i<=num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}