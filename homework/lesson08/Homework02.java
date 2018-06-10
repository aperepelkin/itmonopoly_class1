package homework.lesson08;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Pattern p = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[012])\\.((19|20)\\d\\d)");
        Matcher m = p.matcher(input);

        if (m.matches() == false) {
            System.out.println("Дата введена некорректно");
        } else {

            int index = input.indexOf(".");   //индекс первой точки в строке даты
            int count = 0;                       //индекс для массива
            String words [] = new String[3];    //массив, куда помещаются значения дня, месяца, года
            words[count] = input.substring(0, index);  //кладем в 0 ячейку массива число до первой точки в строке даты

            while (index != -1) {
                count++;
                if (count == 2) {
                    words[count] = input.substring(index+1);
                    break;
                }
                words[count] = input.substring(index+1, input.indexOf(".", index+1));
                index = input.indexOf(".", index+1);
            }

            String day = words[0];
            int month = Integer.parseInt(words[1]);
            String year = words[2];
            final String [] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                                      "Июль", "Август", "Сентябрь", "Октрябрь", "Ноябрь", "Декабрь" };

            System.out.println("месяц: " + months[month-1]);
            System.out.println("день: " + day);
            System.out.println("год: " + year);

        }

    }
}