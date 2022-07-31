package Programmers;

public class NewId {
    public static void main(String[] args) {

        String new_id = "abcdefghijklmn.p";


        String step1 = new_id.toLowerCase();

        String[] notallowed = {"~", "!", "@", "#",
                "$", "%", "^", "&", "*", "(", ")", "=", "+", "[", "{",
                "]", "}", ":", "?", ",", "<", ">", "/"};


//        System.out.println("stp1: " + step1);
        String step2 = step1;
        for (int i = 0; i < notallowed.length; i++) {
            if (step1.contains(notallowed[i])) {
                step2 = step2.replace(notallowed[i], "");
            }
        }
//        System.out.println("stp2: " +step2);


        while (true) {
            if (step2.contains("..")) {
                step2 = step2.replace("..", ".");
            } else {
                break;
            }
        }

        String step3 = step2;
//        System.out.println("stp3: " +step3);

        String step4 = "";

            if (step3.charAt(0) == '.') {
                for (int i = 1; i < step3.length(); i++) {
                    step4 = step4 + step3.charAt(i);
                }
            } else {step4 = step3;}

//        System.out.println("stp4: " +step4);

        if (step4.equals("")) {
            step4 = "a";
        }


        String step5 = "";
            if (step4.charAt(step4.length() - 1) == '.') {
                for (int i = 0; i < step4.length() - 1; i++) {
                    step5 = step5 + step4.charAt(i);
                }
        } else {step5 = step4;}

//        System.out.println(step5);

            if (step5.equals("")) {
            step5 = "a";
        }

        String step6 = "";
        if (step5.length() >= 16) {

            for (int i = 0; i < 15; i++) {
                step6 = step6 + step5.charAt(i);
            }
        }else {step6 = step5;}

//        System.out.println(step6);


        String step7 = "";
        if (step6.charAt(step6.length() - 1) == '.') {
            for (int i = 0; i < step6.length() - 1; i++) {
                step7 = step7 + step6.charAt(i);
            }
        } else {step7 = step6;}

//        System.out.println(step7);


        if (step7.length() <= 2 ) {
            while (step7.length() < 3) {
                step7 = step7 + step7.charAt(step7.length() - 1);
            }
        }

        String answer = step7;


//        System.out.println(step7);

    }
}