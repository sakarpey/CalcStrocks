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
                throw new Exception();
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
        String stringAfterOperator = str.substring(IndexSymAfterOperator); //получаем строку после оператора "+ * / -"
        char[] stringSymAO = stringAfterOperator.toCharArray(); //делим строку полученную выше на массив символов

        int znak=0;
        for (char x:stringSymAO  //в этом цикле проверяем, что в строке после оператора больше нет операторов
             ) {
            if (x=='+'||x=='-'||x=='*'||x=='/') znak++;
            if (x=='"') return;
        }
            if (znak>0) throw new Exception("введенное выражение не соответствует условиям ввода:");

      int z=0; int y=0;
        switch (stringSymAO[0]) { //проверяем символ после оператора
            case '"': y=1;
            case '1': z=1;
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
           if (z==1 && stringSymAO.length>1 && stringSymAO[1]!='0')  throw new Exception("введенное выражение не соответствует условиям ввода: знак после оператора может быть только любой из указанных '\"', 1,2,3,4,5,6,7,8,9,10 ");



           String exA = "Введенное выражение не соответствует условиям ввода:";
           String exKov1 = "ковычки, расставленные в выражении не соответсвуют условию или их нет";
           String exKov2 = "выражение должно начинаться с ковычек";
           String exOper1 = "не верный знак оператора - можно использовать только \"+ * - /\"";
           String exOper2 = "в выражении может быть только один оператор";
           String exAO = "знак после оператора может быть только любой из указанных '\"', 1,2,3,4,5,6,7,8,9,10";



            }



//        if (znakAO[0] == 1) {
//            if (znakAO[1] == 0) ;
//            else {
//                throw new Exception("введенное выражение не соответствует условиям ввода: знак после оператора может быть только любой из указанных '\"', 1,2,3,4,5,6,7,8,9,10 ");
//            }


    }


