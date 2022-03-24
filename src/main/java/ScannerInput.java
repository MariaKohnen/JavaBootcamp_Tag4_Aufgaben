import java.util.Scanner;
public class ScannerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Namen ein und drücken Sie ENTER:");
        //String input =
       String input = nameOutput(scanner.nextLine());
        System.out.println("\n" + "Hallo : " + input);
    }
    public static String nameOutput(String input){
        String outPut = input;
        return outPut;
    }
}
