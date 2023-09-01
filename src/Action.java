public class Action {

   public static String action (String[] str) {

       String res = null;
       if (str[1].equals("+")) {
           res = summa(str);
       }
       if (str[1].equals("-")){
           res = vychitanie(str);
       }


       return res;
   }

    public static String summa(String[] strings) {
        String result = strings[0] + strings[2];
        int x = result.length();

        if (x>40){
           String catResult = result.substring(0,40);

            return catResult+"...";
        }

        return result;

    }
    public static String vychitanie(String[] strings) {
        String result = strings[0] + strings[1];

        return result;
    }
    public static String umnoghenie(String[] strings) {
        String result = strings[0] + strings[1];

        return result;
    }
    public static String delenie(String[] strings) {
        String result = strings[0] + strings[1];

        return result;
    }
}
