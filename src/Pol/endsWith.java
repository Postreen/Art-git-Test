package Pol;

//Проверяет на что оканчивается строка

public class endsWith {
    public static void main(String[] args) {
        String str = new String("Wow best game in the world");
        boolean retVal;

        retVal = str.endsWith("world");
        System.out.println(retVal);
    }
}
