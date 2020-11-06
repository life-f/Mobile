import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[]{
                "slhfdhflshdlf",
                "sdfklsdjfsd",
                "df;sfjd",
                "sdlfjlsdhfsduhfd",
                "ncjff",
                "dkdfjd",
                "hello",
                "lkdfdhs",
                "sdfljsldf",
                "fldfdhslshd"};
        MyStrings myStrings = new MyStrings();
        //поиск максимально длинной строки
        System.out.println(myStrings.findLongestString(strings));
        //определение палиндрома
        System.out.println("Палиндром шалаш " + myStrings.isPalindrom("шалаш"));
        System.out.println("Палиндром привет " + myStrings.isPalindrom("привет"));
        //замена цензурой
        String text = "Я не бяка, ты не бяка";
        System.out.println(myStrings.changeCensored(text));
        //инвертирование слов в строке
        String testString = "This is a test string";
        System.out.println(myStrings.invertWords(testString));
        //Подсчет символов в строке
        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get("text.txt")), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(content);
        myStrings.countChars(content);
    }
}
