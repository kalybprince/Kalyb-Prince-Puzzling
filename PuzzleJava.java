import java.util.Random;
import java.util.Arrays;

public class PuzzleJava {
    public String getRandomArray() {
        Random randMachine = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randMachine.nextInt(21);
        }
        return Arrays.toString(arr);
    }

    public char getRandomLetter() {
        Random randMachine = new Random();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        return alphabet[randMachine.nextInt(27)];
    }

    public String generatePassword() {
        char[] charArray = new char[8];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = getRandomLetter();
        }
        String joinedString = String.valueOf(charArray);
        return joinedString;
    }
}