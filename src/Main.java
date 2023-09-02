import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws Exception {
        System.out.println("Калькулятор умеет выполнять операции сложения строк, вычитания строки из строки,\n умножения строки на число и деления строки на число.");
        System.out.println("Введите ниже строковое выражение вида: \"a\" + \"b\", \"a\" - \"b\", \"a\" * b, \"a\" / b ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        String[] arrayExpression = Chek.chek(str);
        String otvet = Action.action(arrayExpression);
        System.out.println("Результат выражения:\"" + otvet + "\"");


    }


}


