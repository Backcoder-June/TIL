package Programmers;


public class Hamburger_String_recursive {
    static int totalCount = 0;
// 전체 수열을 동시에 검사할 때 로직
    public static void remover(String sum){
        System.out.println("들어온 sum : "+sum);
        if(sum.contains("1231")){
            sum = sum.replace("1231", "7");
            System.out.println("7로 replace : " + sum);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum);

        int count = 0;
        while(sb.indexOf("7") != -1){
            count ++;
            sb = sb.deleteCharAt(sb.indexOf("7"));
            System.out.println("지운 후 : "+sb);
        }
        totalCount += count;
        System.out.println("total : " + totalCount);
        sum = String.valueOf(sb);
        System.out.println("나가는 sum : "+sum);
        if (sum.contains("1231")) {
            remover(sum);
        }
    }



    public static void main(String[] args) {
            int[] ingredient= {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1 };
                String sum = "";
                for(int i = 0; i < ingredient.length; i++){
                    sum += String.valueOf(ingredient[i]);
                }

        remover(sum);
        System.out.println(totalCount);
    }
        }
