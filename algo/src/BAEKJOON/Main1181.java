package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(re.readLine());
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < number; i++) {
            list.add(re.readLine());
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).length() > list.get(j).length()) {
                    String k = list.get(i);
                    list.add(i,list.get(j));
                    list.add(j,k);
                }
                if (list.get(i).length() == list.get(j).length()) {
                    if (compareStrings(list.get(i), list.get(j)) > 0) {
                        String k = list.get(i);
                        list.add(i,list.get(j));
                        list.add(j,k);
                    }
                }
                if (compareStrings(list.get(i), list.get(j)) == 0) {
                    list.remove(i);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static int compareStrings(String s1, String s2) {
        int comparedResult = s1.compareTo(s2);
        return comparedResult;
    }
}
