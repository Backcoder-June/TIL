package Programmers;

import java.util.HashSet;
import java.util.Set;

public class StringSplit {
    static int count = 0;

    public static String sadf(String s, int xCount, int yCount) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println("위" + s);

            System.out.println("위" + i);
            if (s.charAt(i) == s.charAt(0)) {
                xCount++;
                System.out.println("x" + xCount);
            } else {
                yCount++;
                System.out.println("y" + yCount);
            }
            if (xCount == yCount) {
                System.out.println("같은때 " + i);
                s = s.substring(i + 1);
                System.out.println("같"+s);
                count++;
                s = sadf(s,0,0);
                break;
            }
        }

        return s;
    }


    public static void main(String[] args) {
                String s = "a";
        s = sadf(s, 0, 0);
        System.out.println("최"+s);

        if (s.length() > 0) {
            Set<Character> set = new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }

            if (set.size() == 1) {
                count++;
            }
            if (set.size() > 1) {
                count += 2;
            }
        }


        System.out.println(count);
            }
        }
