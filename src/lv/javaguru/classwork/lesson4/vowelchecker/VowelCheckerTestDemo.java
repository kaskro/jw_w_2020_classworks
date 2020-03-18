package lv.javaguru.classwork.lesson4.vowelchecker;

public class VowelCheckerTestDemo {

    public static void test1() {

        VowelChecker checker = new VowelChecker();

        String allVowels = "AEOUIaeoui";
        for (int i = 0; i < allVowels.length(); i++) {
            checkVowel(checker, allVowels.charAt(i));
        }
    }

    private static void checkVowel(VowelChecker checker, char vowel) {
        System.out.println(checker.isVowel(vowel) ? vowel + " is a vowel" : vowel + " is not a vowel");
    }

    public static void main(String[] args) {
        VowelCheckerTestDemo testRunner = new VowelCheckerTestDemo();
        testRunner.test1();
    }
}
