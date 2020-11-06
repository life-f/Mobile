import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class MyStrings {

    public String findLongestString(String[] strings) {
        int maxLengthIndex = 0;
        for (int i = 1; i < strings.length; i++) {
            if ((i + 1) < strings.length)
                if (strings[i].length() > strings[maxLengthIndex].length())
                    maxLengthIndex = i;
        }
        return strings[maxLengthIndex];
    }

    public boolean isPalindrom(String string) {
        char[] str = string.toCharArray();
        for (int i = 0; i < (str.length / 2); i++) {
            if (str[i] != str[str.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public String changeCensored(String text) {
        while (text.contains("бяка")) {
            text = text.replace("бяка", "[вырезано цензурой]");
        }
        return text;
    }

    public String invertWords(String string) {
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            for (int j = 0; j < word.length / 2; j++) {
                char buf = word[j];
                word[j] = word[word.length - 1 - j];
                word[word.length - 1 - j] = buf;
            }
            words[i] = new String(word);
        }
        string = String.join(" ", words);
        return string;
    }

    public void countChars(String text) {
        text = text.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                if (map.containsKey(text.charAt(i))) {
                    map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
                } else {
                    map.put(text.charAt(i), 1);
                }
            }
        }
        System.out.println(map.toString());
    }
}
