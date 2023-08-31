public class Chek {
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
                throw new Exception(Exeption.exA+ Exeption.exKov1);
        }
        switch (arrayChar[0]) { //проверка что первый символ ковычка
            case '"':

                break;
            default:
                throw new Exception(Exeption.exA+ Exeption.exKov2);

        }


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
            case " ": throw new Exception(Exeption.exA+ Exeption.exOper3);
            default:
                throw new Exception(Exeption.exA+ Exeption.exOper1);
        }
        String stringAfterOperator = str.substring(IndexSymAfterOperator); //получаем строку после оператора "+ * / -"
        char[] stringSymAO = stringAfterOperator.toCharArray(); //делим строку полученную выше на массив символов

        int znak=0;
        for (char x:stringSymAO  //в этом цикле проверяем, что в строке после оператора больше нет операторов
        ) {
            if (x=='+'||x=='-'||x=='*'||x=='/') znak++;
            if (x=='"') return;
        }
        if (znak>0) throw new Exception(Exeption.exA+ Exeption.exOper2);

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
            case ' ': throw new Exception(Exeption.exA+ Exeption.exOper3);
            default:
                throw new Exception(Exeption.exA+ Exeption.exAO);

        }
        if (z==1 && stringSymAO.length>1 && stringSymAO[1]!='0')  throw new Exception(Exeption.exA+ Exeption.exAO); //проверка на возможное пристутсвите цифры 10 в выпажении и если больше 10 то исключение







    }
}
