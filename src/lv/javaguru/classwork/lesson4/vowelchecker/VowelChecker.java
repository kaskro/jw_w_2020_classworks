package lv.javaguru.classwork.lesson4.vowelchecker;

public class VowelChecker {

    public boolean isVowel(char character) {
        boolean isVowel = false;
        switch (character){
            case 'A':
            case 'E':
            case 'O':
            case 'U':
            case 'I':
            case 'a':
            case 'e':
            case 'o':
            case 'u':
            case 'i':
                isVowel = true;
                break;
            default:
        }
        return isVowel;
    }

}
