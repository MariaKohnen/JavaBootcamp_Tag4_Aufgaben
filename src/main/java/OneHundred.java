public class OneHundred {

    public static void main(String[] args) {

       for (int i = 1; i <=100; i++) {
           System.out.println(countAndJudge(i));
       }
    }
    public static String countAndJudge(int i){
        String result= "";
        if (i % 3 == 0){
            result = "#";
        }
        if (i % 5 == 0){
            result = result+"$";
        }
        return result + i;
    }
}
