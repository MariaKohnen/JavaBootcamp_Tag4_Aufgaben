public class Intermediate {

    public static void main(String[] args) {
        String[] myArray = new String[] {"eins","zwei","drei","vier","fünf","sechs","sieben","acht","neun","zehn"};
        numberWord(5, myArray);
    }
    public static void numberWord(int number, String[] myArray){
        System.out.println(myArray[number-1]);
    }
}
