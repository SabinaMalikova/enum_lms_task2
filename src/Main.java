import java.util.Scanner;

import static java.time.DayOfWeek.MONDAY;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write day of week: ");
        String getday = scanner.nextLine().toUpperCase(); // Преобразуем введенную строку в верхний регистр
        DaysOfWeek day = DaysOfWeek.valueOf(getday); // Преобразуем строку в перечисление DaysOfWeek

        switch (day) {
            case DaysOfWeek.MONDAY:
                System.out.println(DaysOfWeek.MONDAY.translation+": Я буду изучать Java в понедельник");
                break;
            case DaysOfWeek.TUESDAY:
                System.out.println(DaysOfWeek.TUESDAY.translation+": Я буду изучать английский во вторник");
                break;
            case DaysOfWeek.WEDNESDAY:
                System.out.println(DaysOfWeek.WEDNESDAY.translation+": Я буду практиковаться по Java в среду");
                break;
            case DaysOfWeek.THURSDAY:
                System.out.println(DaysOfWeek.THURSDAY.translation+": Я буду изучать Java и английсктй в четверг");
                break;
            case DaysOfWeek.FRIDAY:
                System.out.println(DaysOfWeek.FRIDAY.translation+": Я буду практиковаться в Java в пятницу");
                break;
            case DaysOfWeek.SATURDAY:
                System.out.println(DaysOfWeek.SATURDAY.translation+": Я буду изучать английский в субботу");
                break;
            case DaysOfWeek.SUNDAY:
                System.out.println(DaysOfWeek.SUNDAY.translation+": В воскресенье у меня выходной");
                break;
            default:
                System.out.println("Неправильно введен день недели");
        }
    }
}