package Programmers;

public class KeyPad {
    public static void main(String[] args) {

        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == 0) {numbers[j] = 11;} }

        String hand = "left";

        String up = hand.toUpperCase();
        char uphand = up.charAt(0);

        StringBuilder sb = new StringBuilder();

        int lefthand = 10;
        int righthand = 12;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {
                sb.append("L");
                lefthand = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                sb.append("R");
                righthand = numbers[i];
            } else if(numbers[i]==2 || numbers[i]==5 || numbers[i]==8 || numbers[i]==11) {

                if ((lefthand == 2 || lefthand == 5 || lefthand == 8 || lefthand == 11)
                        && (righthand == 2 || righthand == 5 || righthand == 8 || righthand == 11)
                ) {
                    if (Math.abs(numbers[i] - (lefthand)) >
                            Math.abs(numbers[i] - (righthand))) {
                        sb.append("R");
                        righthand = numbers[i];
                    } else if (Math.abs(numbers[i] - (lefthand)) <
                            Math.abs(numbers[i] - (righthand))) {
                        sb.append("L");
                        lefthand = numbers[i];

                    } else if (Math.abs(numbers[i] - (lefthand)) ==
                            Math.abs(numbers[i] - (righthand))) {
                        sb.append(uphand);
                        if (hand.equals("right")) {
                            righthand = numbers[i];
                        } else if (hand.equals("left")) {
                            lefthand = numbers[i];}
                    }

                } else if ((lefthand == 2 || lefthand == 5 || lefthand == 8 || lefthand == 11)
                        && !(righthand == 2 || righthand == 5 || righthand == 8 || righthand == 11)
                ) {
                    if (Math.abs(numbers[i] - (lefthand)) >
                            Math.abs(numbers[i] - (righthand - 1))+3) {
                        sb.append("R");
                        righthand = numbers[i];
                    } else if (Math.abs(numbers[i] - (lefthand)) <
                            Math.abs(numbers[i] - (righthand - 1))+3) {
                        sb.append("L");
                        lefthand = numbers[i];
                    } else if (Math.abs(numbers[i] - (lefthand)) ==
                            Math.abs(numbers[i] - (righthand - 1))+3) {
                        sb.append(uphand);
                        if (hand.equals("right")) {
                            righthand = numbers[i];
                        } else if (hand.equals("left")) {
                            lefthand = numbers[i];}
                    }

                } else if (!(lefthand == 2 || lefthand == 5 || lefthand == 8 || lefthand == 11)
                        && (righthand == 2 || righthand == 5 || righthand == 8 || righthand == 11)
                ) {
                    if (Math.abs(numbers[i] - (lefthand + 1))+3 >
                            Math.abs(numbers[i] - (righthand))) {
                        sb.append("R");
                        righthand = numbers[i];
                    } else if (Math.abs(numbers[i] - (lefthand + 1))+3 <
                            Math.abs(numbers[i] - (righthand))) {
                        sb.append("L");
                        lefthand = numbers[i];
                    } else if (Math.abs(numbers[i] - (lefthand + 1))+3 ==
                            Math.abs(numbers[i] - (righthand))) {
                        sb.append(uphand);
                        if (hand.equals("right")) {
                            righthand = numbers[i];
                        } else if (hand.equals("left")) {
                            lefthand = numbers[i];}
                    }

                } else if (!(lefthand == 2 || lefthand == 5 || lefthand == 8 || lefthand == 11)
                        && !(righthand == 2 || righthand == 5 || righthand == 8 || righthand == 11)
                ) {
                    if (Math.abs(numbers[i] - (lefthand + 1)) >
                            Math.abs(numbers[i] - (righthand - 1))) {
                        sb.append("R");
                        righthand = numbers[i];
                    } else if (Math.abs(numbers[i] - (lefthand + 1)) <
                            Math.abs(numbers[i] - (righthand - 1))) {
                        sb.append("L");
                        lefthand = numbers[i];
                    } else if (Math.abs(numbers[i] - (lefthand + 1)) ==
                            Math.abs(numbers[i] - (righthand - 1))) {
                        sb.append(uphand);
                        if (hand.equals("right")) {
                            righthand = numbers[i];
                        } else if (hand.equals("left")) {
                            lefthand = numbers[i]; }
                    }
                }

            }
        }

        String answer = String.valueOf(sb);
        System.out.println(sb);
    }
}
