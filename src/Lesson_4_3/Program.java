package Lesson_4_3;

public class Program {

    public static void main(String[] args) {
        try {
            int result = getFactorial(-5);

            System.out.println(result);
        }
        catch (FactorialException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }

    //----------------------------------------------------------
    public static int getFactorial(int num) throws FactorialException {

        int result = 1;
        if (num < 1) throw new FactorialException("Число меньше 1", num);

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    //----------------------------------------------------------


}
