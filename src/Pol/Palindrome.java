package Pol;

//Проверка, является ли слово полиндромом (читает одинаково задом наперед)

public class Palindrome {
    public static void main(String[] args) {
        String word = "лолдарь";
        System.out.println(isPalindrome(word));
    }
    private static boolean isPalindrome(String word) {
        int count = word.length() / 2;
        int j = word.length() - 1;
        for (int i = 0; i < count; i++) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }

}
