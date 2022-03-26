public class OneHundred {

    public static void main(String[] args) {

        System.out.println(fromOneToHundred());

    }

    public static String fromOneToHundred() {

        String result = "";

        for (int i = 1; i <= 100; i++) {
            result += checkNumber(i) + i + "\n";

        }
        return result;
    }

    public static String checkNumber(int number) {
        String result = "";
        if (number % 3 == 0) {
            result = "#";
        }
        if (number % 5 == 0) {
            result += "$";
        }
        return result;
    }
}
