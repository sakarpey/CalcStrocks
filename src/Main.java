import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("введите строковое выражение");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
       String[] strings = str.split("\\+");

        chek(str);


    }

    public static String summa(String[] strings) {
        String result = strings[0] + strings[1];

        return result;
    }

    public static void chek(String str) throws Exception {
        char[] arrayChar = str.toCharArray();
        int kolKov = 0;
        for (char c : arrayChar) {   //проверка количества ковычек

            if (c == '"') {
                kolKov++;
            }
        }
        switch (kolKov) {
            case 4:
            case 2:
                break;
            default:
                throw new Exception("введенное выражение не соответствует условиям ввода: ковычки, расставленные в выражении не соответсвуют условию или их нет");
        }
        switch (arrayChar[0]) { //проверка что первый символ ковычка
            case '"':

                break;
            default:
                throw new Exception("введенное выражение не соответствует условиям ввода: выражение должно начинаться с ковычек");

        }

        char[] arrayChekSym = {'"', 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int IndexSymTuKov = str.indexOf("\"", 1); //определем индекс второй ковычки в поиске  пропускаем первую
        int IndexOperator = IndexSymTuKov + 1;  //символ после второй ковычки
        int IndexSymAfterOperator = IndexSymTuKov + 2; //второй символ после второй ковычки
        String operator = str.substring(IndexOperator, IndexOperator + 1);
        switch (operator) {
            case "*":
            case "/":
            case "+":
            case "-":
                break;
            default:
                throw new Exception("введенное выражение не соответствует условиям ввода: не верный знак оператора - можно использовать только \"+ * - /\" ");
        }
        String znakAfterOperator = str.substring(IndexSymAfterOperator, IndexSymAfterOperator + 1); //получаем знак после оператора "+ * / -"
        char[] znakAO = znakAfterOperator.toCharArray();

        switch (znakAO[0]) { //проверяем знак после оператора
            case '"':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                break;
            default:
                throw new Exception("введенное выражение не соответствует условиям ввода: знак после оператора может быть только любой из указанных '\"', 1,2,3,4,5,6,7,8,9,10 ");

        }
            String [] arraySplitInput = str.split("[+/*-]");
            if (znakAO[0] !='"' && arraySplitInput.length>1) throw new Exception("введенное выражение не соответствует условиям ввода: введено более одного знака оператора");


//        if (znakAO[0] == 1) {
//            if (znakAO[1] == 0) ;
//            else {
//                throw new Exception("введенное выражение не соответствует условиям ввода: знак после оператора может быть только любой из указанных '\"', 1,2,3,4,5,6,7,8,9,10 ");
//            }


    }


}