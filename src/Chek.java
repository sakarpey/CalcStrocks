public class Chek {
    public static String[] chek(String str) throws Exception {




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
        int operZnak = 0;
        switch (operator) {
            case "+": operZnak=1;break;
            case "-": operZnak=2;break;
            case "*": operZnak=3;break;
            case "/": operZnak=4;break;
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
            if (x=='"') break;
        }
        if (znak>0) throw new Exception(Exeption.exA+ Exeption.exOper2);

        int z=0; int  kovAfterOperator=0;
        switch (stringSymAO[0]) { //проверяем символ после оператора
            case '"': kovAfterOperator=1;break;
            case '1': z=1;break;
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
        //проверка на возможное пристутсвите цифры 10 в выражении - и если больше 10, то исключение
        if (z==1 && stringSymAO.length>1 && stringSymAO[1]!='0')  throw new Exception(Exeption.exA+ Exeption.exAO);
        if (z==1&& stringSymAO.length>2) throw new Exception(Exeption.exA+ Exeption.exAO);

       //проверяем, что операции выполняются согласно первому пункту ТЗ https://github.com/KataAcademy/task-string-calculator.md/blob/abf2b2fe207c9b7c1924f5d8b9fa5a49a47dc5ce/README.md
        if (operZnak==1 && kovAfterOperator==0) throw new Exception(Exeption.exA+Exeption.exSlogheniye);
        if (operZnak==2 && kovAfterOperator==0) throw new Exception(Exeption.exA+Exeption.exVychitanie);
        if (operZnak==3 && kovAfterOperator==1) throw new Exception(Exeption.exA+Exeption.exUmnoghenie);
        if (operZnak==4 && kovAfterOperator==1) throw new Exception(Exeption.exA+Exeption.exDelenie);

        String firstOperand = str.substring(1,IndexSymTuKov);
        String tempSecondOperator = str.substring(IndexSymAfterOperator);
        String secondOperator = tempSecondOperator.replaceAll("\"","");
        String []arrayExpression = new String [] {firstOperand,operator,secondOperator};


        return arrayExpression;
    }
}
