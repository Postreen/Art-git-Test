package Pol;

//Считает сколько цифр в строке и букв

public class Count {
    public static void main(String[] args) {
        String str = "afsdgs84523dgds";
        int count = 0;
        int countLetters = 0;

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                countLetters++;
            }
        }

        System.out.println("Количество цифр в строке" + count);
        System.out.println("Количество букв в строке" + countLetters);
    }
}
