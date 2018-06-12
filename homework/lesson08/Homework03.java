// Можно вводить только 3 числа, с которыми можно произвести два действия соответственно
// Можно вводить как с любым количеством пробелов, так и без них
// Не учитывается порядок действий
// Нельзя вводить числа с плавающей точкой
// Поддерживаются 4 математическиъ операции: + - / *

package homework.lesson08;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("введите выражение: ");
        String expression = scan.nextLine();
        expression = expression.replaceAll("\\s+", "");
        final Pattern p = Pattern.compile("(\\d+)[\\/ | \\* | \\+ | \\-](\\d+)[\\/ | \\* | \\+ | \\-](\\d+)");
        Matcher m = p.matcher(expression);

        if (m.matches() == false) {
            System.out.println("некорректно введено выражение");
        } else {

            String[] numbers = expression.split("\\D");


            String[] operators = expression.split("\\d+");
            System.out.println("длина массива с операторами: " + operators.length);
            for (int i = 0; i < operators.length; i++) {                //Почему три элемента??
                System.out.println(operators[i]);
            }


            double [] numbersDouble = new double[numbers.length];

            for (int i = 0; i < numbersDouble.length; i++) {
                numbersDouble[i] = Double.valueOf(numbers[i]);
                System.out.println(numbersDouble[i]);
            }

            double result = numbersDouble[0];


            for (int i = 1; i < numbersDouble.length; i++) {
                if (operators[i].compareTo("+") == 0) {
                    result = result + numbersDouble[i];
                } else if (operators[i].compareTo("-") == 0) {
                    result = result - numbersDouble[i];
                } else if (operators[i].compareTo("/") == 0) {
                    result = result / numbersDouble[i];
                } else if (operators[i].compareTo("*") == 0) {
                    result = result * numbersDouble[i];
                }
            }
            System.out.println("результат вычисления: " + result);
        }

    }
}
