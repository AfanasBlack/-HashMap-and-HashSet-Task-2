import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        WordsChecker wordsChecker = new WordsChecker(text);

        Set<String> set = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));

        System.out.println(wordsChecker.hasWord(set.contains("amet")));
        System.out.println(wordsChecker.hasWord(set.contains("Pasha")));
        System.out.println(wordsChecker.hasWord(set.contains("Excepteur")));

    }

    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
            "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
            " in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur " +
            "sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
}
