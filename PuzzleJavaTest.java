public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava pJ = new PuzzleJava();
        // GetRandomArray returns array with a length of 10 that contains random ints that are less than 20 (inclusive)
        System.out.println(pJ.getRandomArray());
        // Prints a random letter (char)
        System.out.println(pJ.getRandomLetter());
        // Returns random string of 8 chars
        System.out.println(pJ.generatePassword());
    }
}