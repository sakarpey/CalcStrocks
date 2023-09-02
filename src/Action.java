public class Action {

    public static String action(String[] str) {

        String res = null;
        if (str[1].equals("+")) {
            res = summa(str);
        }
        if (str[1].equals("-")) {
            res = vychitanie(str);
        }
        if (str[1].equals("*")) {
            res = umnoghenie(str);
        }
        if (str[1].equals("/")) {
            res = delenie(str);
        }


        return res;
    }

    public static String summa(String[] strings) {
        String result = strings[0] + strings[2];



        return result;

    }

    public static String vychitanie(String[] strings) {
        String result = strings[0].replaceFirst(strings[2], "");

        return result;
    }

    public static String umnoghenie(String[] strings) {
        int mnoghitel = Integer.parseInt(strings[2]);
        String result = strings[0].repeat(mnoghitel);
        int x = result.length();
        if (x > 40) {
            String catResult = result.substring(0, 40);

            return catResult + "...";
        }

        return result;
    }

    public static String delenie(String[] strings) {
        int x = strings[0].length();
        int y = Integer.parseInt(strings[2]);
        int z = x / y;
        String result = strings[0].substring(0, z);


        return result;
    }
}
