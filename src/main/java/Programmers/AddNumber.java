package Programmers;
import java.util.HashSet;

public class AddNumber {
    public static void main(String[] args) {

        int[] numbers = {5, 8, 4, 0, 6, 7, 9};

        HashSet<Integer> numberSet = new HashSet<>();
        for (int a : numbers
             ) {numberSet.add(a);}

        HashSet<Integer> allnumbers = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            allnumbers.add(i);}

        allnumbers.removeAll(numberSet);

        int answer = 0;
        for (int b : allnumbers
             ) {
            answer += b;}
        System.out.println(answer);
    }
}
