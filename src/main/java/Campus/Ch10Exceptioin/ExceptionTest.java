package Campus.Ch10Exceptioin;

public class ExceptionTest {
    public static void main(String[] args) {

        int i;
        int j;
        try {
           i = Integer.parseInt(args[0]);

           j = Integer.parseInt(args[1]);

        System.out.println(i / j); }

        catch (ArithmeticException e ){

            i = Integer.parseInt(args[0]);
            j = 100;
            System.out.println(i/j );
        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("인덱스를 학인하시오");
        }
        catch (NumberFormatException e ){ e.printStackTrace();}

        catch (Exception e){
            System.out.println(" 나머지 모든 예외는 내가 처리할게요 ");
        }

        finally {
            System.out.println("Main Finished");
        }







        //
    }
}
