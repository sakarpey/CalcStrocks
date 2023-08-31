import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws Exception {
        System.out.println("введите строковое выражение");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        Chek.chek(str);
        String[] strings = str.split("\\+");

    }

    public static String summa(String[] strings) {
        String result = strings[0] + strings[1];

        return result;
    }




    }


