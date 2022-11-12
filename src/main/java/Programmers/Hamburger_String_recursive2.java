package Programmers;


public class Hamburger_String_recursive2 {
    static int totalCount = 0;
// 수열이 마치 stack 처럼 하나씩 들어온다는 가정일 때 로직
//1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1 => 3
    public static void remover(String sum){
        System.out.println("들어온 sum : "+sum);
        StringBuilder sb = new StringBuilder();
        sb.append(sum);

        if(sum.contains("1231")){
             int indexnum = sb.indexOf("1231");
            for (int i = 0; i < 4; i++) {
                sb.deleteCharAt(indexnum);
            }
//            sb = sb.delete(sb.indexOf("1231")-1, sb.indexOf("1231") + 3);
            System.out.println("바꾼후 : " + sb);
            totalCount ++;
        }
        if (String.valueOf(sb).contains("1231") && !String.valueOf(sb).equals("1231") ) {
            remover(String.valueOf(sb));
        }
        if (String.valueOf(sb).equals("1231")) {
            totalCount++;
        }
    }



    public static void main(String[] args) {
            int[] ingredient= {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
                String sum = "";
                for(int i = 0; i < ingredient.length; i++){
                    sum += String.valueOf(ingredient[i]);
                }

        remover(sum);
        System.out.println(totalCount);
    }
        }
