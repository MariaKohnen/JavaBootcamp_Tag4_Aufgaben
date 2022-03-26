import java.util.Scanner;
public class ReadWordArray {
    public static int i = 0;

    public static void main(String[] args) {
        String[] myArray = new String[10];

        while(i < 9){
            userInput();

        }
    }
    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein Wort ein:");
        writeToArray(scanner.nextLine());
    }

    public static void writeToArray(String input){
       i++;
    }

    /*
    public static void arrayPlace(int i) {
        int i = 0;
        for (int i = 0 ; i <= 10 ; i++ )
            System.out.println(userInput(i));
        }
    public static String userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hier den Text eingeben");
        scanner input = scanner.nextLine();
    }
     */





}
