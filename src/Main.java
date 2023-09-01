import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws Exception {
        System.out.println("введите строковое выражение");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


      String[]arrayExpression =  Chek.chek(str);
        String otvet = Action.action(arrayExpression);
        System.out.println("\""+otvet+"\"");




        //        String[] strings = str.split("\\+");

    }






    }


